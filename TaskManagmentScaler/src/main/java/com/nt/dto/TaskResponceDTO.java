package com.nt.dto;

import java.util.Date;
import java.util.List;

import com.nt.entity.NoteEntity;
import com.nt.services.NoteService;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
public class TaskResponceDTO {

	private int id;
	private String title;
	private String description;
	// private LocalDateTime deadline;
	private Date deadline;
	private boolean status;
	private List<NoteEntity> notes;
	
	
}
