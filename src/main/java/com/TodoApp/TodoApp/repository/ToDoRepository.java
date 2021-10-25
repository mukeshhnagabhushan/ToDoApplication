package com.TodoApp.TodoApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TodoApp.TodoApp.model.todo;

public interface ToDoRepository extends JpaRepository < todo, Long > {
    List < todo > findByUserName(String user);
}
