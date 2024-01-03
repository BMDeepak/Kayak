package com.JobPortal.Kayak.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Work {
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 private int workId; 
	 private String companyName; 
	 private String jobTitle; 
	 private LocalDate startDate; 
	 private LocalDate endDate; 
	@Column(length = 2000)
	 private String description;

}
