package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Appointment;

public interface AppopintRepos extends JpaRepository<Appointment, Long> {

}
