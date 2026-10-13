package com.zepto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment")
public class PaymentEntity
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private int amount;
	private String paymentRef;
	private String status;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public int getAmount()
	{
		return amount;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}

	public String getPaymentRef()
	{
		return paymentRef;
	}

	public void setPaymentRef(String paymentRef)
	{
		this.paymentRef = paymentRef;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}
}