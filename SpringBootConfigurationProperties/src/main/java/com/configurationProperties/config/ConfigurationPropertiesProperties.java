package com.configurationProperties.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class ConfigurationPropertiesProperties {

	private String email;
	private String emailPort;
	private Map<String, String> additionalHeaders;
	private CredentialsProperties credentials;

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

}
