package com.configurationProperties.properties;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Using @ConfigurationProperties helps to bind values of the resource
 * properties or ymal files. Internally it uses the conversion service to
 * convert the property values to appropriate Java data type object. This
 * annotation can be used at class level and method level. By default it reads
 * the application.properties always.
 * 
 * Here we can use the @validate and all validation annotations to validate the
 * properties.
 * 
 * RefreshScope used to refresh/re-injected properties for every changes in
 * file.
 */

@Configuration
@ConfigurationProperties
@RefreshScope
public class ConfigurationPropertiesProperties {

	private String email;

	// Spring will auto convert
	private int emailPort;
	@NotEmpty
	private double douValue;
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

	public int getEmailPort() {
		return emailPort;
	}

	public void setEmailPort(int emailPort) {
		this.emailPort = emailPort;
	}

	public double getDouValue() {
		return douValue;
	}

	public void setDouValue(double douValue) {
		this.douValue = douValue;
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

	@Override
	public String toString() {
		return "ConfigurationPropertiesProperties [email=" + email + ", emailPort=" + emailPort + ", douValue="
				+ douValue + ", additionalHeaders=" + additionalHeaders + ", credentials=" + credentials
				+ ", propertyList=" + propertyList + "]";
	}

}
