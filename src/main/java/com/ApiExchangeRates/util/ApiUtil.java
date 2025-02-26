package com.ApiExchangeRates.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.ApiExchangeRates.mapper.MoneyMapper;
import com.ApiExchangeRates.model.Money;

@Configuration
public class ApiUtil {

	@Autowired
	private RestTemplate restTemplate;

	public ApiUtil(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public Money buildApiDolar(ResponseEntity<?> response) {
		//if(response.getStatusCode().value()==200) {
			return MoneyMapper.buildMoney((Money) response.getBody());
		//}
		 
	}
	
    public ResponseEntity<?> buildExchange(String uri, HttpMethod httpMethod,
            HttpEntity<?> httpEntity, Class<?> returnType){
    		return  restTemplate.exchange(uri,httpMethod,httpEntity,returnType);
    }
}
