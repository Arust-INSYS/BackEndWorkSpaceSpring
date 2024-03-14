package com.springboot.project.models.dto;

import com.springboot.project.models.User;
//DTO TRANSPORTAR Y COMPARTIR DATOS
public class UserDto {
	private String title;
	private User user;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}
