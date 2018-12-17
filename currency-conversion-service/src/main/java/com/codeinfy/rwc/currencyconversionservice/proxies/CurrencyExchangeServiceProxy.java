package com.codeinfy.rwc.currencyconversionservice.proxies;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codeinfy.rwc.currencyconversionservice.ConversionWithQuantity;


//@FeignClient(name="currency-exchange-service",url="http://localhost:8010")
@FeignClient(name="zuul-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

//	@GetMapping("/exchange/from/{from}/to/{to}")
	@GetMapping("currency-exchange-service/exchange/from/{from}/to/{to}")
	public ConversionWithQuantity getConversionFactor(@PathVariable("from") String from, @PathVariable("to") String to);
	
}
