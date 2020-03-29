package org.bestbuy.aggregator.service;

import org.bestbuy.aggregator.mdels.OrderDetail;

public interface AggregatorDetailService {

	public OrderDetail getUserOrderDetails(Integer userId);
}
