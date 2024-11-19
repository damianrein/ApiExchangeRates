package com.ApiExchangeRates.service;

import org.springframework.stereotype.Service;

import com.ApiExchangeRates.model.Money;

@Service
public class DolarServiceImpl implements IDolarService{

	@Override
	public Money getOfficialDolar() {
		return null;
	}

	@Override
	public Money getDolarBlue() {
		return null;
	}

}
