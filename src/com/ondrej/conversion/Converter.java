package com.ondrej.conversion;

import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ondrej.delimiter.Delimiter;

@Component
public class Converter {
	
	//@Autowired
	private Delimiter delimiter;
	
	@Autowired
	public Converter(Delimiter delimiter) {
		this.delimiter = delimiter;
	}

	public int[] convertStringToIntArray(String s) {

		String[] stringArr = s.split(delimiter.getDelimiter());

		return IntStream.range(0, stringArr.length)
				.map(i->Integer.parseInt(stringArr[i]))
				.toArray();
	}
	
}
