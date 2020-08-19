package com.configurationProperties.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Property file inside application or classpath we can use below syntax to read
 * the file
 * 
 * Syntax: @propertySource("class:<file name>") or @ConfigurationProperties is
 * used for auto binding.
 * 
 * You could also use @value annotation; by using this we can read one property
 * and it read the property as case sensitive.
 * 
 * ConfigurationProperties annotation is not case sensitive and it is very
 * useful when more values are there in property file.
 */

@Configuration
@PropertySource("classpath:config.properties")
public class PropertySourceSample {

	@Value("${hostAddress}")
	private String hostAddress;
	@Value("${hostPort}")
	private long hostPort;

	public String getHostAddress() {
		return hostAddress;
	}

	public void setHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
	}

	public long getHostPort() {
		return hostPort;
	}

	public void setHostPort(long hostPort) {
		this.hostPort = hostPort;
	}

	@Override
	public String toString() {
		return "PropertySourceSample [hostAddress=" + hostAddress + ", hostPort=" + hostPort + "]";
	}
}
