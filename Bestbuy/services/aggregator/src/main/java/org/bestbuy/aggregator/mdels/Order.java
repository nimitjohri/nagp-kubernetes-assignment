package org.bestbuy.aggregator.mdels;

public class Order {

	private Integer orderId;

	/* private Integer userId; */
	
	private double totalAmount;
	
	private String orderDate;

	public Order() {}
	/**
	 * @param orderId
	 * @param userId
	 * @param totalAmount
	 * @param orderDate
	 */
	public Order(Integer orderId, Integer userId, double totalAmount, String orderDate) {
		super();
		this.orderId = orderId;
//		this.userId = userId;
		this.totalAmount = totalAmount;
		this.orderDate = orderDate;
	}

	/**
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the userId
	 */
	/*
	 * public Integer getUserId() { return userId; }
	 */
	/**
	 * @param userId the userId to set
	 */

	/*
	 * public void setUserId(Integer userId) { this.userId = userId; }
	 */
	/**
	 * @return the totalAmount
	 */
	public double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", totalAmount=" + totalAmount + ", orderDate="
				+ orderDate + "]";
	}

	
}
