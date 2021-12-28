package com.example.productmanagementdetail;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//@Controller
public class SignUpController {
	
	//request mapping method to get signup form page
	@GetMapping()
	public String getSignUpForm() {
		return "signup-form";
	}

	//request mapping method to submit(post)signup form
	@PostMapping(path="/signup")
	public String submitSignUpForm(SignUpForm signUpForm) {
		
		
		return "signupsuccess";
	}
}
