package com.nt.controllers;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
