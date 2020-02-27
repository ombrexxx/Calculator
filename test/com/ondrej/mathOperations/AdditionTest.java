package com.ondrej.mathOperations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ondrej.calculatorApp.AppConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
public class AdditionTest {

	@Autowired
	@Qualifier("addition")
	private Operation operation;
	
	@Test
	public void testArithmeticOperationValidInput() {
		int result = operation.arithmeticOperation("1,2");
		assertEquals(3, result);
	}
	
	@Test
	public void testArithmeticOperationEmptyInput() {	
		assertThrows(NumberFormatException.class, () -> {
			operation.arithmeticOperation("");
		});
	}
	
}
