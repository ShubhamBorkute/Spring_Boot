 package com.nt.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.TaskEntity;
import com.nt.repository.TaskRepo;


@Service
public class TaskService{
	@Autowired
	private TaskRepo taskRepo;

private ArrayList<TaskEntity> tasks=new ArrayList<>();
private int taskId=1;
private final SimpleDateFormat deadlineformat=new SimpleDateFormat("yyyy-MM-dd");


public TaskEntity addTask(String title,String description,String deadline) throws ParseException {
	TaskEntity task=new TaskEntity();
	task.setId(taskId);
	task.setTitle(title);
	task.setDescription(description);
	task.setDeadline(deadlineformat.parse(deadline)); //validate date formate
	task.setStatus(false);
	tasks.add(task);
	taskRepo.save(task);
	System.out.println("Success");
	
	

	taskId++;
	return task;
}
public ArrayList<TaskEntity> getTask(){
	return tasks;
}

public TaskEntity gettaskById( int taskId) {
	/**	morden one**/
	//tasks.stream().findAny().filter(task->task.getId()==taskId).orElse(null);

	
	for(TaskEntity task :tasks) {
		if(task.getId()==taskId) {
			return task;
		}
	}
	return null;

}
}
