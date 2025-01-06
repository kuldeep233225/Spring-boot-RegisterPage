package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	 @Autowired
	    private UserService userService;

	    @GetMapping("/")
	    public String homePage(Model model) {
	        model.addAttribute("user", new User()); // Bind an empty User object
	        return "index"; // Loads index.jsp
	    }

	    @PostMapping("/register")
	    public String registerUser(@ModelAttribute("user") User user, Model model) {
	        System.out.println("Received User: " + user); // Debugging
	        userService.saveUser(user);
	        model.addAttribute("message", "User registered successfully!");
	        return "success"; // Loads success.jsp
	    }
	 // Login Page
	    @GetMapping("/login")
	    public String loginPage() {
	        return "login"; // login.jsp
	    }

	    @PostMapping("/login")
	    public String loginUser(@ModelAttribute User user, Model model) {
	        User loggedInUser = userService.validateUser(user.getEmail(), user.getPassword());
	        if (loggedInUser != null) {
	            model.addAttribute("name", loggedInUser.getName());
	            return "welcome"; // welcome.jsp
	        } else {
	            model.addAttribute("error", "Invalid email or password!");
	            return "login"; // login.jsp
	        }
	    }
}
