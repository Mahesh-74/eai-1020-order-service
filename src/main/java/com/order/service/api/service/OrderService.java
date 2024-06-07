package com.order.service.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.order.service.api.common.Payment;
import com.order.service.api.common.TranctionResponse;
import com.order.service.api.common.TransactionRequest;
import com.order.service.api.entity.Order;
import com.order.service.api.repository.OrderRepository;

@Service
@RefreshScope
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired//(required = false)
	@Lazy
	private RestTemplate restTemplate;

	@Value("${microservice.payment-service.endpoints.endpoint.uri}")
	private String ENDPOINT_URL;

	public TranctionResponse saveOrder(TransactionRequest transactionRequest) {
		String message = "";
		Order order = transactionRequest.getOrder();
		Payment payment = transactionRequest.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		// rest call
		Payment paymentResponse = restTemplate.postForObject(ENDPOINT_URL, payment, Payment.class);
		message = paymentResponse.getPaymentStatus().equals("SUCESS") ? "Payment processing Succssfull and order placed"
				: "there is a failure in payment api , order added to cart";
		orderRepository.save(order);
		return new TranctionResponse(order, paymentResponse.getAmount(), paymentResponse.getTransationId(), message);

	}

}
