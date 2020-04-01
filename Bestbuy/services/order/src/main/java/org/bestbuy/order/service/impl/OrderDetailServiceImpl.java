package org.bestbuy.order.service.impl;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.bestbuy.order.models.Order;
import org.bestbuy.order.service.OrderDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{

	private final static Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());
	
	@Override
	public List<Order> getOrdersByUserId(Integer userId) {
		List<Order> orders = getOrders().stream().filter(o -> o.getUserId() == userId)
				.collect(Collectors.toList());
		
		if (!orders.isEmpty()) {
			return orders;
		}
		LOGGER.error("No orders available for user with Id " + userId);
		return null;
	}

	public List<Order> getOrders(){
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(1, 1, 4250, "14th March 2020"));
		orders.add(new Order(2, 1, 1230, "15th March 2020"));
		orders.add(new Order(3, 2, 1250, "15th January 2020"));
		orders.add(new Order(4, 3, 1250, "10th Feburary 2020"));
		orders.add(new Order(5, 2, 4500, "15th March 2020"));
		return orders;
	}
	
}
