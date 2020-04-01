package org.bestbuy.order.controller;

import java.util.List;

import org.bestbuy.order.models.Order;
import org.bestbuy.order.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "api/v1/orders")
@RestController
public class OrderController {

	@Autowired
	OrderDetailService orderDetailService;
	
	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping("{userId}")
	public List<Order> getAllOrderForUser(@PathVariable Integer userId) {
		System.out.println("Working from Port: " + serverPort);
		return orderDetailService.getOrdersByUserId(userId);
	}

}
