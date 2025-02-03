package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Appointment;
import com.example.demo.service.AppointmentService;

@Controller
public class AppointmentController {
	@Autowired
    private AppointmentService appointmentService;

    @GetMapping("/appointment")
    public String showAppointmentForm(Model model) {
        model.addAttribute("appointment", new Appointment());
        return "appointment";
    }

    @PostMapping("/appointment")
    public String submitAppointmentForm(@ModelAttribute Appointment appointment, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            // Print validation errors
            bindingResult.getAllErrors().forEach(error -> {
                System.out.println(error.getDefaultMessage());
            });
            model.addAttribute("message", "Validation failed. Please check your input.");
            return "appointment"; // Return to the form page with error message
        }

        try {
            appointmentService.saveAppointment(appointment);
            model.addAttribute("message", "Appointment booked successfully!");
            return "success";
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            model.addAttribute("message", "Failed to book appointment. Please try again.");
            return "error";
        }
    }

}
