package com.ondrej.calculatorApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
				
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Calculator calculator = context.getBean("calculator", Calculator.class);

		System.out.println(calculator.validateAndCompute());
				
		context.close();
	}
}


