package com.configurationProperties.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
@RefreshScope
public class ConfigurationPropertiesProperties {

	private String email;
	private String emailPort;
	private Map<String, String> additionalHeaders;
	private CredentialsProperties credentials;
	private List<String> propertyList;

	@Bean
	@ConfigurationProperties(prefix = "user.role.groupid")
	@RefreshScope
	public UserProperties getUserProperties() {
		return new UserProperties();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailPort() {
		return emailPort;
	}

	public void setEmailPort(String emailPort) {
		this.emailPort = emailPort;
	}

	public Map<String, String> getAdditionalHeaders() {
		return additionalHeaders;
	}

	public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
		this.additionalHeaders = additionalHeaders;
	}

	public CredentialsProperties getCredentials() {
		return credentials;
	}

	public void setCredentials(CredentialsProperties credentials) {
		this.credentials = credentials;
	}

	public List<String> getPropertyList() {
		return propertyList;
	}

	public void setPropertyList(List<String> propertyList) {
		this.propertyList = propertyList;
	}

}
