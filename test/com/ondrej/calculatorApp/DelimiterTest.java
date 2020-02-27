package com.ondrej.calculatorApp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
@TestPropertySource("classpath:input.properties")
public class DelimiterTest {

	@Value("${delimiter.values}")
    public String delimiter;
	
	@Test
	public void testForDelimiterValueComma() {
		assertTrue(delimiter.contains(","));
	}
	
	@Test
	public void testForDelimiterValueSemicolon() {
		assertFalse(delimiter.contains("+"));
	}
	
}
