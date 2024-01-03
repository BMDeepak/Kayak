package com.JobPortal.Kayak.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Education {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 private int educationId; 
	 private DegreeType degreeType; 
	 private String degreeName; 
	 private String fieldOfStudy; 
	 private LocalDate startDate; 
	 private LocalDate endDate; 
	 @Column(length = 2000)
	 private String description;

}
