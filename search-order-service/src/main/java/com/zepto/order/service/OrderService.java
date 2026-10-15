package com.zepto.order.service;

<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;

>>>>>>> 98abf0bc1ab98b91b111a691f0ca526a6ffd2549
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.order.entity.OrderEntity;
<<<<<<< HEAD
=======
import com.zepto.order.exception.OrderDoesNotExistsException;
>>>>>>> 98abf0bc1ab98b91b111a691f0ca526a6ffd2549
import com.zepto.order.repository.OrderRepository;
import com.zepto.order.response.OrderResponse;

@Service
public class OrderService
{
	@Autowired
	OrderRepository orderRepository;

	public OrderResponse getOrderById(int orderId)
	{
		System.out.println("OrderService.getOrderById()::::::::::::: START");

		// OrderEntity entity = orderRepository.findById(orderId).get();

<<<<<<< HEAD
		OrderEntity entity = orderRepository.findOrdersByOrderId(orderId);

		OrderResponse response = new OrderResponse();
		response.setId(entity.getId());
		response.setOrderId(entity.getOrderId());
		response.setCustomerId(entity.getCustomerId());
		response.setProductId(entity.getProductId());
		response.setQuantity(entity.getQuantity());
=======
		OrderEntity entity = null;
		OrderResponse response = new OrderResponse();

		try
		{
			entity = orderRepository.findOrdersByOrderId(orderId);
			response.setId(entity.getId());
			response.setOrderId(entity.getOrderId());
			response.setCustomerId(entity.getCustomerId());
			response.setProductId(entity.getProductId());
			response.setQuantity(entity.getQuantity());

		} catch (Exception e)
		{
			throw new OrderDoesNotExistsException("  Order id " + orderId + " does not exists");
		}
>>>>>>> 98abf0bc1ab98b91b111a691f0ca526a6ffd2549

		System.out.println("OrderService.getOrderById()::::::::::::: END");

		return response;
	}
<<<<<<< HEAD
=======

	public List<OrderResponse> listOrdersByPayment(String paymentType)
	{
		System.out.println("OrderService.listOrdersByPayment():::::::::::::::::: START");
		List<OrderEntity> orderEntities = orderRepository.findOrdersByPaymentType(paymentType);

		List<OrderResponse> response = new ArrayList<OrderResponse>();

		for (OrderEntity entity : orderEntities)
		{
			OrderResponse orderResponse = new OrderResponse();

			orderResponse.setId(entity.getId());
			orderResponse.setOrderId(entity.getOrderId());
			orderResponse.setCustomerId(entity.getCustomerId());
			orderResponse.setProductId(entity.getProductId());
			orderResponse.setQuantity(entity.getQuantity());
			response.add(orderResponse);
		}
		System.out.println("OrderService.listOrdersByPayment():::::::::::::::::: END");

		return response;

	}
>>>>>>> 98abf0bc1ab98b91b111a691f0ca526a6ffd2549
}
