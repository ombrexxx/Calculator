package com.ondrej.conversion;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ondrej.calculatorApp.AppConfig;
import com.ondrej.delimiter.Delimiter;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
public class ConverterTest {

	@Autowired
	private Delimiter delimiter;
	
	@Test
	public void testConversionOfStringToIntArray() {
		Converter converter = new Converter(delimiter);
		int[] result = converter.convertStringToIntArray("1,2");
		assertArrayEquals(new int[] {1,2}, result);	
	}
	
	@Test
	public void testConversionOfStringToIntArrayForEmptyString() {
		Converter converter = new Converter(delimiter);
		assertThrows(NumberFormatException.class, () -> {
			converter.convertStringToIntArray("");
		});
	}
	
}
