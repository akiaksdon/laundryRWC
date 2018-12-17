package com.codeinfy.rwc.demolimits.service.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("demo-limits-service")
public class Configurations {

		private int minimum;
		private int maximum;
		
		public int getMinimum() {
			return minimum;
		}
		public void setMinimum(int minimum) {
			this.minimum = minimum;
		}
		public int getMaximum() {
			return maximum;
		}
		public void setMaximum(int maximum) {
			this.maximum = maximum;
		}
		
		
		
		
		
		
		
		
		
		
}
