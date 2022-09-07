package com.example.demo;

import com.example.beans.House;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.example.beans")
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		House house = context.getBean(com.example.beans.House.class);

		System.out.println("App still running?");

		System.out.println("App still running?");

		System.out.println("App still running?");
	}

}
