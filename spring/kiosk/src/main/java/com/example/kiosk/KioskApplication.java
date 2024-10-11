package com.example.kiosk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KioskApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(KioskApplication.class, args);
	}

}
