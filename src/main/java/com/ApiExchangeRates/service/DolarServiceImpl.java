package com.ApiExchangeRates.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.ApiExchangeRates.model.Money;
import com.ApiExchangeRates.util.ApiUtil;

@Service
public class DolarServiceImpl implements IDolarService{

	@Value("${apidolar.base-url}")
	private String baseApi;
	@Autowired
	private ApiUtil apiUtil;
	
	
	public DolarServiceImpl(@Autowired ApiUtil apiUtil) {
		this.apiUtil = apiUtil;
	}

	@Override
	public Money getOfficialDolar() {
		String api = "https://dolarapi.com/v1/dolares/oficial";
		return apiUtil.buildApiDolar(
				apiUtil.buildExchange(api, HttpMethod.GET,new HttpEntity<>(null),Money.class));
	}

	@Override
	public Money getDolarBlue() {
		String api = "https://dolarapi.com/v1/dolares/blue";
		return apiUtil.buildApiDolar(
				apiUtil.buildExchange(api, HttpMethod.GET,new HttpEntity<>(null),Money.class));
	}

}
