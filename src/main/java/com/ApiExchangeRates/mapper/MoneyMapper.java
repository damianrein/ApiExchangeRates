package com.ApiExchangeRates.mapper;

import java.util.List;

import com.ApiExchangeRates.model.Money;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MoneyMapper {

	private final static ObjectMapper mapper= new ObjectMapper();
	
	public static Money buildMoney(Money m) {
		return new Money(
				m.getMoney(),
				m.getName(),
				m.getBuyValue(),
				m.getSaleValue());
	}
	
	public static List<Money> buildMoney(Object body) {
		List<Money> money = mapper.convertValue(body, new TypeReference<List<Money>>() {});
				return money;
	}
}