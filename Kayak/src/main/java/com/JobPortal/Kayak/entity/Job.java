package com.JobPortal.Kayak.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jobId;
	private String jobTitle;
	@Column(length = 2000)
	private String jobDescription;
	private Company Company;
	private String jobSalary;
	private LocalDate jobCreatedDate;
	private LocalDate jobApplicationCloseDate;

	@ManyToMany
	private Set<Skill> requiredSkills;

	@OneToMany(mappedBy = "job")
	private List<JobApplication> applications;

	@ManyToOne
	private Company company;

}
