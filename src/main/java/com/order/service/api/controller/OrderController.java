package com.order.service.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.api.common.TranctionResponse;
import com.order.service.api.common.TransactionRequest;
import com.order.service.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/bookOrder")
	public TranctionResponse bookOrder(@RequestBody TransactionRequest transactionRequest) {

		return orderService.saveOrder(transactionRequest);

	}

}
