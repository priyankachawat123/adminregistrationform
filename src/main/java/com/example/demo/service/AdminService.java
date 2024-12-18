package com.example.demo.service;

import com.example.demo.model.Admin;
import java.util.List;

	public interface AdminService {
		
	    Admin saveAdmin(Admin admin);
	    Admin getAdminById(Long id);
	    List<Admin> getAllAdmins();
	    void deleteAdmin(Long id);
	}



