/**
 * 
 */
package org.bestbuy.aggregator.controller;

import java.util.List;

import org.bestbuy.aggregator.mdels.OrderDetail;
import org.bestbuy.aggregator.service.AggregatorDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nimitjohri
 *
 */

@RequestMapping(value = "api/v1/orderdetails")
@RestController
public class AggregatorController {

	@Autowired
	AggregatorDetailService aggregatorDetailService;


	@GetMapping("{userId}")
	public OrderDetail getAllOrderForUser(@PathVariable Integer userId) {
		return aggregatorDetailService.getUserOrderDetails(userId);
	}

	
}
