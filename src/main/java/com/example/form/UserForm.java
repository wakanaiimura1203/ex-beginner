package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserForm {

	@NotBlank(message="名前は必須です")
	private String name;
	@NotBlank(message="年齢は必須です")
	private String age;
	@Size(min=0,max=120,message="コメントは120文字以内で記載してください")
	private String comment;

	// ageをint型に変換
	public int getIntAge() {
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

	@Override
	public String toString() {
		return "UserForm [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}

	
}
