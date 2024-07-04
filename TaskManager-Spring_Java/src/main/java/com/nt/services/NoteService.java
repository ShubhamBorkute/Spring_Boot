package com.nt.services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.entity.NoteEntity;
import com.nt.entity.TaskEntity;
@Service
public class NoteService {
	private TaskService taskService;
	private HashMap<Integer,TaskNoteHolder> taskNotesMap=new HashMap<>();
	
	public NoteService(TaskService taskService) {
		this.taskService = taskService;
	}


	class TaskNoteHolder{
		protected int noteId=1;
		protected ArrayList<NoteEntity> notes=new ArrayList<>();
	}
	
public List<NoteEntity>getNoteForTask(int taskId){
	TaskEntity task=taskService.gettaskById(taskId);
	if(task==null)return null;
	if(taskNotesMap.get(taskId)==null) {
		taskNotesMap.put(taskId, new TaskNoteHolder() );
	}
	return taskNotesMap.get(taskId).notes;
	
}

public NoteEntity addNoteForTask(int taskId,String title,String body) {
	TaskEntity task=taskService.gettaskById(taskId);
	if(task==null)return null;
	if(taskNotesMap.get(taskId)==null) {
		taskNotesMap.put(taskId, new TaskNoteHolder() );
	}
	
	TaskNoteHolder taskNoteHolder =taskNotesMap.get(taskId);
	NoteEntity note=new NoteEntity();
	note.setId(taskId);
	note.setTitle(title);
	note.setDescription(body);
	taskNoteHolder.notes.add(note);
	taskNoteHolder.noteId++;
	return note;
}

}
