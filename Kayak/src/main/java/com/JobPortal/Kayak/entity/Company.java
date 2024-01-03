package com.JobPortal.Kayak.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Company {
	private int companyId; 
	private String companyName; 
	@Column(length = 2000)
	private String summary; 
	@OneToMany 
	private List<SocialProfile> socialProfile; 
	@OneToMany(mappedBy = "company") 
	private List<Job> jobs; 
	@ManyToOne 
	private User user;

}
