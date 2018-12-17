package com.codeinfy.rwc.currencyexchangeservice;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	private static final Logger log = LoggerFactory.getLogger(CurrencyExchangeController.class);

	@Autowired
	Environment environment; //one way of reading environment variable (properties)
	
	@Autowired
	ConfigurationProp configurationProp;//2nd way of reading environment variable (properties)
	
	@Autowired
	ExchangeFactorRepository exchangeFactorRepository;
	
	@GetMapping("/exchange/from/{from}/to/{to}")
	public ConversionFactor getConversionFactor(@PathVariable String from, @PathVariable String to) {
//		= new ConversionFactor(1, from, to, BigDecimal.valueOf(65));
		ConversionFactor conversionFactor  = exchangeFactorRepository.findByFromAndTo(from, to);
		log.info("currency echange {}",conversionFactor);
		System.out.println("port " + configurationProp.getPort());
		conversionFactor.setPort(Integer.parseInt(environment.getProperty("server.port")));
		return conversionFactor;
	}

}
