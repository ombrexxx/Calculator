package com.ondrej.calculatorApp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.ondrej")
@PropertySource(value = "input.properties")
public class AppConfig {
}
