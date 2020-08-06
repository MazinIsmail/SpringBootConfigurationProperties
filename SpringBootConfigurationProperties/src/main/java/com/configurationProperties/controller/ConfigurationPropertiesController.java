package com.configurationProperties.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/config")
public class ConfigurationPropertiesController {

	public static final Logger logger = LoggerFactory.getLogger(ConfigurationPropertiesController.class);

	@GetMapping(value = "/")
	public void getConfigurationProperties() {
	}

	@PutMapping(value = "/")
	public void updateConfigurationProperties() {
	}

}
