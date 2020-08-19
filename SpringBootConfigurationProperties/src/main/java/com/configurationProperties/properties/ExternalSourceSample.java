package com.configurationProperties.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * If you want to externalize the properties or use other properties file name
 * we can use the @propertyResource. By using propertyResource annotation we can
 * externalize the properties and read it
 * 
 * Syntax:
 * 
 * @propertySource("file:<file location>")
 * 
 * If property file is available at external location
 * 
 * If you want auto bind the data, we have to use @ConfigurationProperties other
 * wise we can use @value annotation.
 */

@Configuration
@ConfigurationProperties
@PropertySource("file:C:\\Mazin Ismail\\external.properties")
public class ExternalSourceSample {

	private String dbName;
	private long dbPort;

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public long getDbPort() {
		return dbPort;
	}

	public void setDbPort(long dbPort) {
		this.dbPort = dbPort;
	}

	@Override
	public String toString() {
		return "ExternalSourceSample [dbName=" + dbName + ", dbPort=" + dbPort + "]";
	}

}
