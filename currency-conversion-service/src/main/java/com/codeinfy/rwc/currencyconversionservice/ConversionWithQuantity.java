package com.codeinfy.rwc.currencyconversionservice;

import java.math.BigDecimal;

public class ConversionWithQuantity {
	
	
	private int id;
	private String from;
	private String to;
	private BigDecimal factor;
	private BigDecimal calculatedvalue;
	private int port;
	
	
	protected ConversionWithQuantity() {
		
	}
	
	
	
	
	public ConversionWithQuantity(int id, String from, String to, BigDecimal factor, BigDecimal calculatedvalue,
			int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.factor = factor;
		this.calculatedvalue = calculatedvalue;
		this.port = port;
	}




	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getFactor() {
		return factor;
	}
	public void setFactor(BigDecimal factor) {
		this.factor = factor;
	}
	public BigDecimal getCalculatedvalue() {
		return calculatedvalue;
	}
	public void setCalculatedvalue(BigDecimal calculatedvalue) {
		this.calculatedvalue = calculatedvalue;
	}
	
	
}
