package com.nt.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dto.CreateNoteDTO;
import com.nt.dto.CreateNoteResponceDTO;
import com.nt.entity.NoteEntity;
import com.nt.services.NoteService;

@RestController
@RequestMapping("/tasks/{taskId}/notes")
public class NoteController {

	private NoteService noteService;
	
	public NoteController(NoteService noteService) {
			this.noteService = noteService;
	}

	@GetMapping("")
	public ResponseEntity<List<NoteEntity>> getnotes(@PathVariable("taskId") Integer taskId) {
		var notes=noteService.getNoteForTask(taskId);
		
		return ResponseEntity.ok(notes);
	}
	
	@PostMapping("")
	public ResponseEntity<CreateNoteResponceDTO> addNote(
			@PathVariable("taskId") Integer taskId,
			@RequestBody CreateNoteDTO body) {
		var note=noteService.addNoteForTask(taskId, body.getTitle() ,body.getBody());
		
		return ResponseEntity.ok(new CreateNoteResponceDTO(taskId,note));    
		
	}
	

}
