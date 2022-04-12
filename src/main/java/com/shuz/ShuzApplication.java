package com.shuz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ShuzApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShuzApplication.class, args);
	}

}
