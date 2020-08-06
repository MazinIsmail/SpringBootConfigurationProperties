package com.configurationProperties.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class ConfigurationPropertiesProperties {

	private String email;
	private int emailPort;

}
