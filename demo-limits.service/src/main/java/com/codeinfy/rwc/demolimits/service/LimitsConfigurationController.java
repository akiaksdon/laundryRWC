package com.codeinfy.rwc.demolimits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeinfy.rwc.demolimits.service.bean.Configurations;

@RestController
public class LimitsConfigurationController {

    @Autowired
	Configurations configurations;
	
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsCOnfiguration(){
		
		return new LimitsConfiguration(configurations.getMaximum(), configurations.getMinimum() );
	}
}
