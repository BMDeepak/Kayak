package com.JobPortal.Kayak.entity;

public enum DegreeType {
	ASSOCIATES("Associate Degree"), 
	 BATCHELORS("Batchelor's Degree"), 
	 MASTERS("Master's Degree"), 
	 DOCTORATE("Doctorate"), 
	 DIPlOMA("Diploma"); 
	 
	 
	 private final String value; 
	 DegreeType(String value) { 
	 this.value = value; 
	 } 
	 
	 public String getValue() { 
	 return value; 
	 }

}
