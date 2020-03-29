package org.bestbuy.order.service;

import java.util.List;

import org.bestbuy.order.models.Order;

public interface OrderDetailService {

	public List<Order> getOrdersByUserId(Integer userId);
}
