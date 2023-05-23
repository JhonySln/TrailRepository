package com.jhony.vistorManagement.dao;

import com.jhony.vistorManagement.dto.Admin;

public interface AdminDAO {
	public String saveAdmin(Admin admin);

	Admin  adminLogin(String userName,String password);
}
