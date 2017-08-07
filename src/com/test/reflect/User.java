package com.test.reflect;

public class User {
	private int id;
	private String username;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void login(){
		System.out.println("user login");
	}

}
