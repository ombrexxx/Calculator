package com.ondrej.validation;

import org.springframework.stereotype.Component;

import com.ondrej.myExceptions.MyException;

@Component
public class StringValidatorImpl implements Validator{
	
	public void checkForNull(String input) throws NullPointerException {
		if(input == null) {
			throw new NullPointerException("null input");
		}	
	}
	
	public void checkForEmptyString(String input) throws MyException {
		if(input.isEmpty()) {
			throw new MyException("empty string");
		}	
	}
	
}
