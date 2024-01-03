package com.JobPortal.Kayak.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 private int contactId; 
	 private String contactName; 
	 private long contactNumber; 
	 private String contactMailId;

}
