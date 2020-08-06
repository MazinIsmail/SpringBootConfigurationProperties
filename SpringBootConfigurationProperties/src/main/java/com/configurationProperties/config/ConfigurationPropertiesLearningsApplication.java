package com.configurationProperties.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.configurationProperties*")
public class ConfigurationPropertiesLearningsApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigurationPropertiesLearningsApplication.class, args);
	}
}
