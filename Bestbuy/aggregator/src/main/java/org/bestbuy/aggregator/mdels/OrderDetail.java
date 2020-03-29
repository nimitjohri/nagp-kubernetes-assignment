package org.bestbuy.aggregator.mdels;

import java.util.List;

public class OrderDetail {

	private User user;
	
	private List<Order> orders;
	
	public OrderDetail() {}

	/**
	 * @param user
	 * @param orders
	 */
	public OrderDetail(User user, List<Order> orders) {
		super();
		this.user = user;
		this.orders = orders;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the orders
	 */
	public List<Order> getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "OrderDetail [user=" + user + ", orders=" + orders + "]";
	}
}
