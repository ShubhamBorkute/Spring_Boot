package com.nt.entity;

import java.util.Date;
import java.util.List;

import lombok.Data;
@Data
public class TaskEntity {

	private int id;
	private String title;
	private String description;
	// private LocalDateTime deadline;
	private Date deadline;
	private boolean status;
	//private List<NoteEntity> notes;
	/*
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 * public String getTitle() { return title; } public void setTitle(String title)
	 * { this.title = title; } public String getDescription() { return description;
	 * } public void setDescription(String description) { this.description =
	 * description; }
	 * 
	 * 
	 * 
	 * public Date getDeadline() { return deadline; } public void setDeadline(Date
	 * deadline) { this.deadline = deadline; }
	 * 
	 * public LocalDateTime getDeadline() { return deadline; } public void
	 * setDeadline(LocalDateTime deadline) { this.deadline = deadline; }
	 * 
	 * public boolean isStatus() { return status; } public void setStatus(boolean
	 * status) { this.status = status; }
	 * 
	 * @Override public String toString() { return "TaskEntity [id=" + id +
	 * ", title=" + title + ", description=" + description + ", deadline=" +
	 * deadline + ", status=" + status + "]"; }
	 */

}
