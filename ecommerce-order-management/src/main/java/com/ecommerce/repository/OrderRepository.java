package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entity.OrderEntity;

public interface OrderRepository extends CrudRepository<OrderEntity, Integer>
{

}