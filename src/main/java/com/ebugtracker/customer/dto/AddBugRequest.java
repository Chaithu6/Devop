package com.ebugtracker.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Validated

public class AddBugRequest {
    @NotBlank
    @Length(min = 1 ,max = 10)
    private String bugPriority;
    @NotBlank
    @Length(min = 1 ,max = 1000)
    private String snippet;
    @NotBlank
    @Length(min = 1 ,max = 15)
    private String relatedDepartment;
	public AddBugRequest(@NotBlank @Length(min = 1, max = 10) String bugPriority,
			@NotBlank @Length(min = 1, max = 1000) String snippet,
			@NotBlank @Length(min = 1, max = 15) String relatedDepartment) {
		super();
		this.bugPriority = bugPriority;
		this.snippet = snippet;
		this.relatedDepartment = relatedDepartment;
	}
	public String getBugPriority() {
		return bugPriority;
	}
	public void setBugPriority(String bugPriority) {
		this.bugPriority = bugPriority;
	}
	public String getSnippet() {
		return snippet;
	}
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}
	public String getRelatedDepartment() {
		return relatedDepartment;
	}
	public void setRelatedDepartment(String relatedDepartment) {
		this.relatedDepartment = relatedDepartment;
	}
    
	
	}
	
	


