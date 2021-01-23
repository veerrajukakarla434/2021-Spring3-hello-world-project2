package com.vkakarla.spring3.project2;

public class HelloWorld {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void show() {
		System.out.println("Welcome to " + message + " - Vkakarla-Tutorials");
	}
}
