package com.child1.child1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// from parent folder run : mvn test-compile failsafe:integration-test failsafe:verify
@SpringBootApplication
public class Child1Application {

	public static void main(String[] args) {
		SpringApplication.run(Child1Application.class, args);
	}

}
