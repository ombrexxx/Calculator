package com.ondrej.delimiter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Delimiter {

	@Value("${delimiter.values}")
	String delimiter;
	
	public String getDelimiter() {
		return String.format("[%s]+", delimiter);
	}
}
