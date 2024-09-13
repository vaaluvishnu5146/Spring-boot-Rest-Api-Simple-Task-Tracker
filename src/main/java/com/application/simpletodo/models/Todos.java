package com.application.simpletodo.models;

public class Todos {
	int id;
	String title;
	Boolean isCompleted;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	public Todos(int id, String title, Boolean isCompleted) {
		this.id = id;
		this.title = title;
		this.isCompleted = isCompleted;
	}
}