package com.ApiExchangeRates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiExchangeRates.model.Money;
import com.ApiExchangeRates.service.DolarServiceImpl;

@RestController
@RequestMapping("/api")
public class DolarController {

	private DolarServiceImpl service;

	public DolarController(@Autowired DolarServiceImpl service) {
		this.service = service;
	}
	
	@GetMapping("/official")
	public ResponseEntity<Money> getOficial(){
		return ResponseEntity.ok(service.getOfficialDolar());
	}
}
