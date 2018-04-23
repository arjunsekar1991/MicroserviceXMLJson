package com.service.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.service.rest")
public class XmlJsonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlJsonServiceApplication.class, args);
	}
}
