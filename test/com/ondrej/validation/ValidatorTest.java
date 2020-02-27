package com.ondrej.validation;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ondrej.calculatorApp.AppConfig;
import com.ondrej.myExceptions.MyException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
public class ValidatorTest {

	@Autowired
	@Qualifier("stringValidator")
	Validator validator;
	
	@Test
	public void testForNull() {  
		assertThrows(NullPointerException.class, () -> {
			validator.checkForNull(null);
		});
	}
		  
	@Test
	public void testForEmptyString() {  
		assertThrows(MyException.class, () -> {
			validator.checkForEmptyString("");
		});
	}
	 
}
