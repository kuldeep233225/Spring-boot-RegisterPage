package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {
	 @GetMapping("/admin/logout")
	    public String logout() {
	        // Logout Logic (Session invalidate etc.)
	        return "redirect:/admin/login";
	    }

}
