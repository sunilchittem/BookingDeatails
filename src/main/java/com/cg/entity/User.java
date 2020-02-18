package com.cg.entity;

public class User {
	private String userId;
	private String userName;
	public User(String userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	
}
