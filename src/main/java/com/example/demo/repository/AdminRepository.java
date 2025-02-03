package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AdminUser;
@Repository
public interface AdminRepository extends JpaRepository<AdminUser, Long> {
	AdminUser findByUsername(String username);

}
