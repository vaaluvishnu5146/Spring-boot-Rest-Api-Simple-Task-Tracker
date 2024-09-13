package com.application.simpletodo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.simpletodo.models.Todos;

@RestController
public class TodoController {
	@GetMapping("/")
	public List<Todos> getAllTodos() {
		List<Todos> todos = new ArrayList<>();
		todos.add(new Todos(1, "Vishnu vardhan", false));
		todos.add(new Todos(2, "React 18", false));
		return todos;
	}
}
