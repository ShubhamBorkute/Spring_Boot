package com.nt.dto;

import com.nt.entity.NoteEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor 
public class CreateNoteResponceDTO {
	private Integer taskId;
private NoteEntity noteEntity;
}
