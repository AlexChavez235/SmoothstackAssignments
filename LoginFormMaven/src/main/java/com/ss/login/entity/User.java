package com.ss.login.entity;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = -4283331578713112300L;
	private String username;
	private String password;
	
 	public User() {}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	


}
