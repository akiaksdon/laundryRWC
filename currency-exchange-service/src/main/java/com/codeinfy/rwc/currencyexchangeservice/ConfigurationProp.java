package com.codeinfy.rwc.currencyexchangeservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("server")
public class ConfigurationProp {
	
	private int port;

	protected ConfigurationProp() {
		
	}
	public ConfigurationProp(int port) {
		super();
		this.port = port;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	

}
