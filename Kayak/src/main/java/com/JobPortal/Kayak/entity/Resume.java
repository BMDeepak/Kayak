package com.JobPortal.Kayak.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Resume {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resumeId;
	private String Intro;
	@OneToOne(mappedBy = "user")
	private User user;

	@OneToOne
	Contact contact;

	@OneToMany
	private List<Work> workList;
	@OneToMany
	private List<Education> educationList;
	@OneToMany
	private List<SocialProfile> socialProfile;

	@OneToMany
	private List<Project> projects;

	@ManyToMany
	private Set<Skill> skills;

}
