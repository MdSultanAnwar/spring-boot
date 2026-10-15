package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.CustomerEntity;
@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer>
{

}