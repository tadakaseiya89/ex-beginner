package com.example.form;

import javax.validation.constraints.NotNull;

public class UserForm {

	@NotNull
	private String name;
	@NotNull
	private String age;
	@NotNull
	private String comment;

	public Integer getIntAge() {
		return Integer.parseInt(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
