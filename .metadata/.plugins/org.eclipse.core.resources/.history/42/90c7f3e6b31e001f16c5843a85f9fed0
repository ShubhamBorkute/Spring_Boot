package com.nt.controllers;
import java.text.ParseException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dto.CreateTaskDTO;
import com.nt.dto.ErrorResponceDTO;
import com.nt.entity.TaskEntity;
import com.nt.services.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	private final TaskService taskService;
	
	
	
public TaskController(TaskService taskService) {
		super();
		this.taskService = taskService;
	}



@GetMapping("")
public ResponseEntity<List<TaskEntity>> getTasks() {
	var tasks=taskService.getTask();
	return ResponseEntity.ok(tasks);
}
	
	

@GetMapping("/{id}")
public ResponseEntity<TaskEntity> getTasksById(@PathVariable("id")Integer id) {
	var tasks=taskService.gettaskById(id);
	
	if(tasks==null) {
		ResponseEntity .notFound().build();
	}
	return ResponseEntity.ok(tasks);
}

@PostMapping("")
public ResponseEntity<TaskEntity> addTask(@RequestBody CreateTaskDTO body) throws ParseException { 
	var task = taskService.addTask(body.getTitle(), body.getDescription(), body.getDeadline());
return ResponseEntity.ok(task);
}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponceDTO>handleError(Exception e){
		if(e instanceof ParseException) {
			return ResponseEntity.badRequest().body(new ErrorResponceDTO("Invalid Date Format"));
		}
		e.printStackTrace();
		return ResponseEntity.internalServerError().body(new ErrorResponceDTO("Invalid Date Format"));
	}
}
