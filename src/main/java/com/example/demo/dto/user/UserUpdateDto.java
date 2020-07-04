package com.example.demo.dto.user;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserUpdateDto {
	@NotBlank(message = "name is mandatory")
	private String name;
	@NotBlank(message = "surname is mandatory")
	private String surname;
	@NotNull(message = "roles is mandatory")
	private List<String> roles;
	
	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}