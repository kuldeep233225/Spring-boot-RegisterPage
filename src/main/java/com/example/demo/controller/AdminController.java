package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.AdminUser;
import com.example.demo.model.Appointment;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.service.AdminService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController {
	 @Autowired
	    private AdminService adminService;

	    @GetMapping("/admin/login")
	    public String showLoginPage() {
	        return "AdminLogin"; // admin_login.jsp को लोड करेगा
	    }

	    @PostMapping("/admin/login")
	    public String loginAdmin(@RequestParam String username, @RequestParam String password, Model model) {
	        AdminUser adminUser = adminService.findByUsername(username);

	        if (adminUser != null && adminUser.getPassword().equals(password)) {
	            model.addAttribute("adminUser", adminUser);
	            return "SuccessAdmin"; // success_admin.jsp को लोड करेगा
	        } else {
	            model.addAttribute("error", "Invalid Username or Password");
	            return "AdminLogin"; // admin_login.jsp को दुबारा दिखाएगा
	        }
	    }

}
