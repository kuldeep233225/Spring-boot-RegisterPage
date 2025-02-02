 package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.AppopintRepos;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
//	Log in page show
	 @Autowired
	    private UserRepository userRepository;

	    public void saveUser(User user) {
	        userRepository.save(user);
	    }
//	    Log In
	    public User validateUser(String email, String password) {
	        return userRepository.findByEmailAndPassword(email, password);
	    }
	    
	    
}
