package com.vinicius.taskmanagement.infraestructure.repository;

import com.vinicius.taskmanagement.core.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
