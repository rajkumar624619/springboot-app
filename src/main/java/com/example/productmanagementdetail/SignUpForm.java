package com.example.productmanagementdetail;
//model class to hold signup form details
public class SignUpForm {
	private String name;
	private String password;
	
	public SignUpForm(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public SignUpForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
