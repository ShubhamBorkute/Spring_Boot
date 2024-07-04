package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.TaskEntity;

public interface TaskRepo extends CrudRepository<TaskEntity, Integer>  {

}
