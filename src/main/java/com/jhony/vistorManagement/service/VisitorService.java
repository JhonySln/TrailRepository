package com.jhony.vistorManagement.service;

import java.util.List;

import com.jhony.vistorManagement.dto.Visitor;

public interface VisitorService {

   public	Visitor saveVisitor(Visitor visitor);
   public String updateVisitor(Visitor visitor);
   public List<Visitor>getVisitorDataSortedByName();
   public List<Visitor>getdegree();   

}
