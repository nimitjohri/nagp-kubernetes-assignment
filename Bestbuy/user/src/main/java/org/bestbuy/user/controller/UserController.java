package org.bestbuy.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.bestbuy.user.models.User;
import org.bestbuy.user.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@RestController
@RequestMapping(value = "/api/v1/users")
public class UserController {

	@Autowired
	private EurekaClient eurekaClient;
	
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
		return null;
	}

}
