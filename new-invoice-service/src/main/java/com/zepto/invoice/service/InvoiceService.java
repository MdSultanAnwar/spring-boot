package com.zepto.invoice.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.zepto.invoice.entity.InvoiceEntity;
import com.zepto.invoice.repository.InvoiceRepository;
import com.zepto.invoice.request.response.InvoiceRequest;
import com.zepto.invoice.request.response.InvoiceResponse;

@Service
public class InvoiceService
{
	@Autowired
	InvoiceRepository invoiceRepository;
	
	  Logger log=   LoggerFactory.getLogger(InvoiceService.class);

	public InvoiceResponse createInvoice(InvoiceRequest invoiceRequest)
	{
		log.info("enter to the servies layer");
		InvoiceEntity entity = new InvoiceEntity();

		entity.setCustomerName(invoiceRequest.getCustomerName());
		entity.setGst(invoiceRequest.getGst());
		entity.setStatus("PAID");
		entity.setInvId("INV1234");

		entity = invoiceRepository.save(entity);
		InvoiceResponse invoiceResponse = new InvoiceResponse();
		if (entity.getId() > 0)
		{
			invoiceResponse.setCustomerName(entity.getCustomerName());
			invoiceResponse.setGst(entity.getGst());
			invoiceResponse.setStatus(entity.getStatus());
			invoiceResponse.setInvId(entity.getInvId());
			invoiceResponse.setId(entity.getId());

		}
		return invoiceResponse;
	}

	@Cacheable(value = "findAll",key = "#page")
	public List<InvoiceResponse> getInvoices(int page, int size)
	{
		log.warn("******************************************************");
		Pageable pageable = PageRequest.of(page, size);
		Page<InvoiceEntity> result = invoiceRepository.findAll(pageable);

		List<InvoiceResponse> response = new ArrayList<InvoiceResponse>();

		for (InvoiceEntity invoiceEntity : result)
		{
			InvoiceResponse invoiceResponse = new InvoiceResponse();

			invoiceResponse.setId(invoiceEntity.getId());
			invoiceResponse.setInvId(invoiceEntity.getInvId());
			invoiceResponse.setCustomerName(invoiceEntity.getCustomerName());
			invoiceResponse.setGst(invoiceEntity.getGst());
			invoiceResponse.setStatus(invoiceEntity.getStatus());

			response.add(invoiceResponse);
		}
		return response;
	}

}
