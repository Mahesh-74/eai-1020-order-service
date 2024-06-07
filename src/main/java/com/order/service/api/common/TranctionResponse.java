package com.order.service.api.common;

import com.order.service.api.entity.Order;

public class TranctionResponse {

	private Order order;
	private Double amount;
	private String transationId;
	private String message;
	public TranctionResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public TranctionResponse(Order order, Double amount, String transationId, String message) {
		super();
		this.order = order;
		this.amount = amount;
		this.transationId = transationId;
		this.message = message;
	}

	public Order getOrder() {
		return order;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getTransationId() {
		return transationId;
	}
	public void setTransationId(String transationId) {
		this.transationId = transationId;
	}
	
}
