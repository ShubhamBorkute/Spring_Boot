package com.nt.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateTaskDTO {
	public String title;
	public String description;
	public String deadline;
	
	
	
	
	public CreateTaskDTO() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	
	
}
