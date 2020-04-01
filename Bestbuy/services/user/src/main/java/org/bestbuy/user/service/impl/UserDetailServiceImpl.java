package org.bestbuy.user.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bestbuy.user.exception.UserNotFoundException;
import org.bestbuy.user.models.User;
import org.bestbuy.user.service.UserDetailService;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserDetailServiceImpl implements UserDetailService {

	@Override
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User(1,"Nimit Johri", "nimitjohri15@gmail.com", "1234567890", 24, "vxyz street, New Delhi Pincode-110074"));
		users.add(new User(2,"Ram Prasad", "ramprasad15@gmail.com", "1234567810", 30, "abcd street, New Delhi Pincode-110074"));
		users.add(new User(3,"Gajodhar Singh", "gajodharsingh15@gmail.com", "1234567101", 32, "qwerty street, New Delhi Pincode-110074"));
		return users;
	}

	@Override
	public User getUserById(Integer userId) {
		List<User> users = getUsers();
		Optional<User> userById = users.stream().filter(u -> userId.equals(u.getUserId())).findFirst();
		if (userById.isPresent()) {
			return userById.get();
		}
		throw new UserNotFoundException(userId);
	}
	

}
