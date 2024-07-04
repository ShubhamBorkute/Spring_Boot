package com.nt.controllers;
import java.util.List;
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
