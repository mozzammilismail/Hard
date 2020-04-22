package com.singtel.ngoft.drools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@SpringBootApplication(scanBasePackages = "com.drools")
@SpringBootApplication
@ComponentScan(basePackages = "com.singtel.*")


public class Application {



	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	
}
