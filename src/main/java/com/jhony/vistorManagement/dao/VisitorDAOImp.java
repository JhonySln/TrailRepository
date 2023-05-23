package com.jhony.vistorManagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.jhony.vistorManagement.dto.Visitor;
import com.jhony.vistorManagement.util.ConnectionUtil;

public class VisitorDAOImp implements VisitorDAO{
private  Connection connection = ConnectionUtil.connectionGiver();

	@Override
	public String saveVisitor(Visitor visitor) {

		if(connection!=null) {
			String query="INSERT INTO visitor (`Name`,`Contact`,`Email`,`Degree`,`Stream`,`Th_Per`,`Yop`,`Course`,`Gender`,`Address`)"
							+" VALUES (?,?,?,?,?,?,?,?,?,?)";
			try {
				PreparedStatement ps=connection.prepareStatement(query);
				ps.setString(1,visitor.getName());
				ps.setString(2,visitor.getContact());
				ps.setString(3,visitor.getEmail());
				ps.setString(4,visitor.getDegree());
				ps.setString(5,visitor.getStream());
				ps.setString(6,visitor.getTh_Per());
				ps.setInt(7,visitor.getYop());
				ps.setString(8,visitor.getCourse());
				ps.setString(9,visitor.getGender());
				ps.setString(10,visitor.getAddress());
				
				int n=ps.executeUpdate();
				return "no of rows selected="+n;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
    	 return "connected successfully";
     }
		return "Something went Wrong man";
	}

	@Override
	public String updateVisitor(Visitor visitor) {

		return null;
	}

	@Override
	public Connection connectionGiver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor deleteVisitorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor getVisitorByContact(String contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor ggetVisitorByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> getAllVisitor() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
