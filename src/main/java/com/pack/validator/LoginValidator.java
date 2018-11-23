package com.pack.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pack.modal.Login;

public class LoginValidator implements Validator {

	 public boolean supports(Class clazz) {
	        return Login.class.isAssignableFrom(clazz);
	    }
	 
	    public void validate(Object target, Errors errors)
	    {
	       // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "error.firstName", "Username is required.");
	        //ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.lastName", "Password is required.");
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "error.firstName","sdc");
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pass", "error.password","sdssssdsd");
	 
	    }

}
