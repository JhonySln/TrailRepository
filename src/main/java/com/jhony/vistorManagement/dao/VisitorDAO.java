package com.jhony.vistorManagement.dao;

import java.sql.Connection;
import java.util.List;

import com.jhony.vistorManagement.dto.Visitor;

public interface VisitorDAO {
	
	public Connection connectionGiver();
	
	public String saveVisitor(Visitor visitor);
	
	public String updateVisitor(Visitor visitor);
    
	public Visitor deleteVisitorById(int id);
	
	public Visitor getVisitorByContact(String contact);
	
	public Visitor ggetVisitorByEmail(String email);
	
	public List<Visitor> getAllVisitor();
}
