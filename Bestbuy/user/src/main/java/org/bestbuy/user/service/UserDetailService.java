package org.bestbuy.user.service;

import java.util.List;

import org.bestbuy.user.models.User;

public interface UserDetailService {

	public List<User> getUsers();
	
	public User getUserById(Integer userId);
}
