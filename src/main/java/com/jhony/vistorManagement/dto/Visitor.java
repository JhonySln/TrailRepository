package com.jhony.vistorManagement.dto;

public class Visitor {
	private int id;
	private String name;
	private String contact;
	private String email;
	private String degree;
	private String Stream;
	private String Th_Per;
	private int Yop;
	private String gender;
	private String course;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDegree() {
		return degree;
	}
	public String getStream() {
		return Stream;
	}
	public void setStream(String stream) {
		Stream = stream;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getTh_Per() {
		return Th_Per;
	}
	public void setTh_Per(String th_Per) {
		Th_Per = th_Per;
	}
	public int getYop() {
		return Yop;
	}
	public void setYop(int yop) {
		Yop = yop;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Visitor [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email + ", degree="
				+ degree + ", Stream=" + Stream + ", Th_Per=" + Th_Per + ", Yop=" + Yop + ", gender=" + gender
				+ ", course=" + course + ", address=" + address + "]";
	}
	
	}
	
	
	
	


