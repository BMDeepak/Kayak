package com.JobPortal.Kayak.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int userId; 
	private String userName; 
	private String useEmail; 
	private String userPhoneNumber; 
	private String userPassword; 
	private UserRole userRole; 
	@Column(length = 250)
	private String userIntro; 
	@OneToMany(mappedBy = "user") 
	private List<Company> companies; 
	@OneToMany(mappedBy = "user") 
	private List<JobApplication> applications; 
	@OneToOne(mappedBy = "user") 
	private Resume resume;

}
