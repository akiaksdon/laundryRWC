package com.codeinfy.rwc.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ConversionFactor {

	    @Id
		private int id;
	    
	    @Column(name="currency_from")
		private String from;
	    
	    @Column(name="currency_to")
		private String to;
	    
		private BigDecimal factor;
		
		
		private int port;
		
		
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
		
		protected ConversionFactor() {
			
		}
		public ConversionFactor(int id, String from, String to, BigDecimal factor) {
			super();
			this.id = id;
			this.from = from;
			this.to = to;
			this.factor = factor;
		}

		
		
		
}
