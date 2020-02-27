package com.ondrej.mathOperations;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ondrej.conversion.Converter;

@Component
public class Addition implements Operation{
	
	@Autowired
	private Converter converter;
	
	public int arithmeticOperation(String input) {
		
		return Arrays.stream(converter.convertStringToIntArray(input))
					.reduce((a,b)->a+b)
					.getAsInt();
	}
	
}
