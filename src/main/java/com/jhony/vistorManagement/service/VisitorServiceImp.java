package com.jhony.vistorManagement.service;

import java.util.List;

import com.jhony.vistorManagement.dao.VisitorDAO;
import com.jhony.vistorManagement.dao.VisitorDAOImp;
import com.jhony.vistorManagement.dto.Visitor;
import com.jhony.vistorManagement.util.AES;
import com.jhony.vistorManagement.util.AppConstants;

public class VisitorServiceImp implements VisitorService {
	VisitorDAO dao=null;
	
	public VisitorServiceImp() {
		dao =new VisitorDAOImp();  
	}

	@Override
	public Visitor saveVisitor(Visitor visitor) {
		
		String encContact=AES.encrypt(getContact(),AppConstants.SECRET_KEY);
		String encEmail=AES.encrypt(getEmail(),AppConstants.SECRET_KEY);
		String encAddress=AES.encrypt(getAddress(),AppConstants.SECRET_KEY);
		visitor.setContact(encContact);
		visitor.setEmail(encEmail);
		visitor.setAddress(encAddress);
		
		return visitor;
		
	}

	private String getAddress() {
		return null;
	}
	
	private String getEmail() {
		return null;
	}

	private String getContact() {
		
		return null;
	}

	@Override
	public String updateVisitor(Visitor visitor) {
		
		return null;
	}

	@Override
	public List<Visitor> getVisitorDataSortedByName() {
		return null;
	}

	@Override
	public List<Visitor> getdegree() {
		return null;
	}
}
 