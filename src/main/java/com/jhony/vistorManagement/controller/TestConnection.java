package com.jhony.vistorManagement.controller;

import com.jhony.vistorManagement.dao.VisitorDAO;
import com.jhony.vistorManagement.dao.VisitorDAOImp;
import com.jhony.vistorManagement.dto.Visitor;

public class TestConnection {
	
public static void main(String[] args) {
	VisitorDAO dao=new VisitorDAOImp();
	System.out.println(dao.saveVisitor(new Visitor()));
	
	
}
}
