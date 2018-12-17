package com.codeinfy.rwc.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.codeinfy.rwc.currencyconversionservice.proxies.CurrencyExchangeServiceProxy;

@RestController
public class CurrencyConversionController {
	
	private static final Logger log = LoggerFactory.getLogger(CurrencyConversionController.class);

	
	@Autowired
	CurrencyExchangeServiceProxy currencyExchangeServiceProxy;
	
	@GetMapping("/converter/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionWithQuantity convertCurrency(@PathVariable String from,@PathVariable String to,
													@PathVariable BigDecimal quantity){
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from",from);
		uriVariables.put("to",to);
		uriVariables.put("quantity",quantity.toString());
		ResponseEntity<ConversionWithQuantity> restTemplate= new RestTemplate().getForEntity("http://localhost:8010/exchange/from/{from}/to/{to}", ConversionWithQuantity.class, uriVariables);
		ConversionWithQuantity conversionWithQuantity = restTemplate.getBody();
		return new ConversionWithQuantity(conversionWithQuantity.getId(),from,to,conversionWithQuantity.getFactor(),quantity.multiply(conversionWithQuantity.getFactor()),conversionWithQuantity.getPort());
	}
	
	@GetMapping("/converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionWithQuantity convertCurrencyFeign(@PathVariable String from,@PathVariable String to,
													@PathVariable BigDecimal quantity){
		
		
		ConversionWithQuantity conversionWithQuantity = currencyExchangeServiceProxy.getConversionFactor(from, to);
		log.info("coverter-feign {}",conversionWithQuantity);
		return new ConversionWithQuantity(conversionWithQuantity.getId(),from,to,conversionWithQuantity.getFactor(),quantity.multiply(conversionWithQuantity.getFactor()),conversionWithQuantity.getPort());
	}
}
