package org.bestbuy.user.models;

public class User {
	private Integer userId;
	
	private String name;
	
	private String emailAddress;

	private String phoneNo;
	
	private Integer age;

	private String address;

	public User(Integer userId, String name, String emailAddress, String phoneNo, Integer age, String address) {
		super();
		this.userId = userId;
		this.name = name;
		this.emailAddress = emailAddress;
		this.phoneNo = phoneNo;
		this.age = age;
		this.address = address;
	}
	
	
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}


	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}


	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}


	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", emailAddress=" + emailAddress + ", phoneNo=" + phoneNo
				+ ", age=" + age + ", address=" + address + "]";
	}
	
	

}
