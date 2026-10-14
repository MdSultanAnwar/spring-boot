package com.zepto.order.controller;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> 98abf0bc1ab98b91b111a691f0ca526a6ffd2549
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.order.response.OrderResponse;
import com.zepto.order.service.OrderService;

@RequestMapping("orders/")
@RestController
public class OrderController
{
	@Autowired
	OrderService orderService;

	@GetMapping("findOrder")
	public OrderResponse searchOrderById(@RequestParam("id") int id)
	{
		return orderService.getOrderById(id);
	}

<<<<<<< HEAD
=======
	@GetMapping("findOrderByPayment")
	public List<OrderResponse> findOrderByPayment(@RequestParam("paymentType") String paymentType)
	{
		return orderService.listOrdersByPayment(paymentType);
	}

>>>>>>> 98abf0bc1ab98b91b111a691f0ca526a6ffd2549
}
