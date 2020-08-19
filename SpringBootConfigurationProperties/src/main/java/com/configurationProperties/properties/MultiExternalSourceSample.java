package com.configurationProperties.properties;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * If we have multiple externalize properties files, then use the below syntax.
 * 
 * Syntax: @propertySource({"file:<file location>"},"file:<file location>"})
 * 
 * If property file is available at external location. If you have same property
 * key name in both file, it will take last file value.
 */

@Configuration
@ConfigurationProperties
@PropertySource({ "file:C:\\Mazin Ismail\\external.properties", "file:C:\\Mazin Ismail\\externalTwo.properties" })
public class MultiExternalSourceSample {

	@NotEmpty
	private String dbName;
	@NotEmpty
	private long dbPort;
	private String envName = "test";
	private LocalDate localdate;

	public LocalDate getLocaldate() {
		return localdate;
	}

	public void setLocaldate(String localdate) {
		this.localdate = LocalDate.parse(localdate, DateTimeFormatter.ofPattern("d-MM-yyyy"));
	}

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

	public String getEnvName() {
		return envName;
	}

	public void setEnvName(String envName) {
		this.envName = envName;
	}

	@Override
	public String toString() {
		return "MultiExternalSourceSample [dbName=" + dbName + ", dbPort=" + dbPort + ", envName=" + envName
				+ ", localdate=" + localdate + "]";
	}

}
