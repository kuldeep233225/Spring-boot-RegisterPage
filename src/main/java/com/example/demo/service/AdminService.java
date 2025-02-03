package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AdminUser;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminService {
	 @Autowired
	    private AdminRepository adminRepository;

	    public AdminUser findByUsername(String username) {
	        return adminRepository.findByUsername(username);
	    }

}
