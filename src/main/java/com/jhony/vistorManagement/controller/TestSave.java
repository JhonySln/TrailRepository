package com.jhony.vistorManagement.controller;

import com.jhony.vistorManagement.dao.VisitorDAO;
import com.jhony.vistorManagement.dao.VisitorDAOImp;
import com.jhony.vistorManagement.dto.Visitor;

public class TestSave {
	public static void main(String[] args) {
		Visitor visitor=new Visitor();
		visitor.setName("Jhony");
		visitor.setAddress("Tirupati");
		visitor.setDegree("Bsc");
		visitor.setStream("Math");
		visitor.setTh_Per("75");
		visitor.setCourse("java");
		visitor.setYop(2022);
		visitor.setGender("Male");
		visitor.setEmail("Jh@2002gmail.com");
		visitor.setContact("987654321");
		
		VisitorDAO dao=new VisitorDAOImp();
		System.out.println(dao.saveVisitor(visitor));	
		      
	}

}
