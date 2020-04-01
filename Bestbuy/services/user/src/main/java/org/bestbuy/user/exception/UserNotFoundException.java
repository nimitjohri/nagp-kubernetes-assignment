/**
 * 
 */
package org.bestbuy.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author nimitjohri
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(Integer userId) {
		super("User with id " + userId + "not found");
	}
}
