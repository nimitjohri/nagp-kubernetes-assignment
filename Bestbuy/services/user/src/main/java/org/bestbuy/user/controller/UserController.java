package org.bestbuy.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.bestbuy.user.exception.UserNotFoundException;
import org.bestbuy.user.models.User;
import org.bestbuy.user.service.UserDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/users")
public class UserController {

	@Resource
	private UserDetailService userDetailService;
	
	@GetMapping
	public List<User> getUsers() {
		return userDetailService.getUsers();
	}
	
	@GetMapping("{userId}")
	public User getUserById(@PathVariable Integer userId) {
		User user = userDetailService.getUserById(userId);
		if (user != null) {
			return user;
		}
		throw new UserNotFoundException(userId);
	}

}
