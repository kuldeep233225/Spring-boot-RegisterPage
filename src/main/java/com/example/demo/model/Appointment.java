package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Appointment {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "full_name")
	    private String fullName;

	    @Column(name = "email")
	    private String email;

	    @Column(name = "aadhar_number")
	    private String aadharNumber;

	    @Column(name = "appointment_date")
	    private String appointmentDate;

	    @Column(name = "appointment_time")
	    private String appointmentTime;

	    @Column(name = "selected_doctor")
	    private String selectedDoctor;

	    @Column(name = "additional_notes")
	    private String additionalNotes;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAadharNumber() {
			return aadharNumber;
		}

		public void setAadharNumber(String aadharNumber) {
			this.aadharNumber = aadharNumber;
		}

		public String getAppointmentDate() {
			return appointmentDate;
		}

		public void setAppointmentDate(String appointmentDate) {
			this.appointmentDate = appointmentDate;
		}

		public String getAppointmentTime() {
			return appointmentTime;
		}

		public void setAppointmentTime(String appointmentTime) {
			this.appointmentTime = appointmentTime;
		}

		public String getSelectedDoctor() {
			return selectedDoctor;
		}

		public void setSelectedDoctor(String selectedDoctor) {
			this.selectedDoctor = selectedDoctor;
		}

		public String getAdditionalNotes() {
			return additionalNotes;
		}

		public void setAdditionalNotes(String additionalNotes) {
			this.additionalNotes = additionalNotes;
		}

	    // Getters and Setters
	    // Add getters and setters for all fields
	}