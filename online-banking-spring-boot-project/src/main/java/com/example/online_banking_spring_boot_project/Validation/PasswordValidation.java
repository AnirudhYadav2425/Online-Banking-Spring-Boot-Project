package com.example.online_banking_spring_boot_project.Validation;

public class PasswordValidation 
{
	public static boolean isValidPassword(String password) {
	    String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^\\w\\s]).{8,15}$";
	    return password != null && password.matches(pattern);
	}
}
