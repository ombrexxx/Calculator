package com.ondrej.calculatorApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ondrej.mathOperations.Operation;
import com.ondrej.validation.Validator;

@Component
public class Calculator {

	@Value("${input.value}")
	private String input;

	@Autowired
	private Operation operation;
	
	@Autowired
	@Qualifier("stringValidatorImpl")
	private Validator validator;	
	
	public int validateAndCompute() {
		
			validator.checkForNull(input);
			validator.checkForEmptyString(input);

		return operation.arithmeticOperation(input);
	}
	
}




