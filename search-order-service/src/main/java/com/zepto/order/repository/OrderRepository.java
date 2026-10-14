package com.zepto.order.repository;

<<<<<<< HEAD
import org.springframework.data.repository.CrudRepository;
=======
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
>>>>>>> 98abf0bc1ab98b91b111a691f0ca526a6ffd2549
import org.springframework.stereotype.Repository;

import com.zepto.order.entity.OrderEntity;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Integer>
{
<<<<<<< HEAD
	//Derived Method
  public OrderEntity findOrdersByOrderId(int orderid);  // select * from orders where order_id=?
=======
	// Derived Method
	public OrderEntity findOrdersByOrderId(int orderid); // select * from orders where order_id=?

	@Query("select o  from OrderEntity o where  o.paymentMethod = :type and o.quantity <2 ")
	public List<OrderEntity> findOrdersByPaymentType(@Param("type") String paymentType);
>>>>>>> 98abf0bc1ab98b91b111a691f0ca526a6ffd2549
}
