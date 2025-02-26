package com.ApiExchangeRates.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Money {

	@JsonProperty("moneda")
	private String money;
	@JsonProperty("nombre")
	private String name;
	@JsonProperty("compra")
	private Double buyValue;
	@JsonProperty("venta")
	private Double saleValue;
	
	public Money() {}
	
	public Money(String money, String name, Double buyValue, Double saleValue) {
		this.money = money;
		this.name = name;
		this.buyValue = buyValue;
		this.saleValue = saleValue;
	}
	
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBuyValue() {
		return buyValue;
	}
	public void setBuyValue(Double buyValue) {
		this.buyValue = buyValue;
	}
	public Double getSaleValue() {
		return saleValue;
	}
	public void setSaleValue(Double saleValue) {
		this.saleValue = saleValue;
	}
	
	
}
