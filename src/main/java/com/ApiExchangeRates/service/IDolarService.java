package com.ApiExchangeRates.service;

import com.ApiExchangeRates.model.Money;

public interface IDolarService {

	Money getOfficialDolar();
	Money getDolarBlue();
}
