package com.codeinfy.rwc.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeFactorRepository extends JpaRepository<ConversionFactor, Integer> {

	ConversionFactor findByFromAndTo(String from,String to);
}
