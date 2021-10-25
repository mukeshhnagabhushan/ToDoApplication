package com.TodoApp.TodoApp.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import com.TodoApp.TodoApp.model.todo;

public interface ITodoService {

    List < todo > getTodosByUser(String user);

    Optional < todo > getTodoById(long id);

    void updateTodo(todo todo);

    void addTodo(String name, String desc, Date targetDate, boolean isDone);

    void deleteTodo(long id);

    void saveTodo(todo todo);
}
