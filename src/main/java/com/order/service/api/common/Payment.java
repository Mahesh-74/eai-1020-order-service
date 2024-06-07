package com.order.service.api.common;

public class Payment {

	
	private Integer paymentId;
	private String paymentStatus;
	private String transationId;
	private Integer orderId;
	private Double amount;

	public Payment() {
		// TODO Auto-generated constructor stub
	}

	
	public Payment(Integer paymentId, String paymentStatus, String transationId, Integer orderId, Double amount) {
		super();
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
		this.transationId = transationId;
		this.orderId = orderId;
		this.amount = amount;
	}


	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getTransationId() {
		return transationId;
	}

	public void setTransationId(String transationId) {
		this.transationId = transationId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
