package com.vinicius.taskmanagement.infraestructure.repository;

import com.vinicius.taskmanagement.core.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
