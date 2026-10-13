package com.ecommerce.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderEntity
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String orderNumber;

	private LocalDate orderDate;

	private BigDecimal totalAmount;

	private String status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	private CustomerEntity customer;

	// Getter and Setter for id

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	// Getter and Setter for orderNumber

	public String getOrderNumber()
	{
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber)
	{
		this.orderNumber = orderNumber;
	}

	// Getter and Setter for orderDate

	public LocalDate getOrderDate()
	{
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate)
	{
		this.orderDate = orderDate;
	}

	// Getter and Setter for totalAmount

	public BigDecimal getTotalAmount()
	{
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount)
	{
		this.totalAmount = totalAmount;
	}

	// Getter and Setter for status

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	// Getter and Setter for customer

	public CustomerEntity getCustomer()
	{
		return customer;
	}

	public void setCustomer(CustomerEntity customer)
	{
		this.customer = customer;
	}
}