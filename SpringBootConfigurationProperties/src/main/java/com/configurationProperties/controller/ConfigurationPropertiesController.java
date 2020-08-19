package com.configurationProperties.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.configurationProperties.properties.ConfigurationPropertiesProperties;
import com.configurationProperties.properties.ExternalSourceSample;
import com.configurationProperties.properties.MultiExternalSourceSample;
import com.configurationProperties.properties.PropertySourceSample;

@RestController
@RequestMapping(value = "/config")
public class ConfigurationPropertiesController {

	public static final Logger logger = LoggerFactory.getLogger(ConfigurationPropertiesController.class);

	@Autowired
	private ConfigurationPropertiesProperties configurationPropertiesProperties;

	@Autowired
	private PropertySourceSample propertySourceSample;

	@Autowired
	private ExternalSourceSample externalSourceSample;

	@Autowired
	private MultiExternalSourceSample multiExternalSourceSample;

	@GetMapping(value = "/")
	public void getConfigurationProperties() {
		logger.info("To string {}", configurationPropertiesProperties.toString());
		configurationPropertiesProperties.getUserProperties().getTester();
	}

	@PutMapping(value = "/")
	public void updateConfigurationProperties() {
	}

	@GetMapping(value = "/propertysource")
	public void getPropertySourceProperties() {
		logger.info("To string {}", propertySourceSample.toString());
		propertySourceSample.getHostAddress();
	}

	@GetMapping(value = "/propertyexternal")
	public void getPropertySourceExternal() {
		logger.info("To string {}", externalSourceSample.toString());
		externalSourceSample.getDbName();
	}

	@GetMapping(value = "/propertyMultiexternal")
	public void getPropertySourceMultiExternal() {
		logger.info("To string {}", multiExternalSourceSample.toString());
		multiExternalSourceSample.getDbName();
	}
}
