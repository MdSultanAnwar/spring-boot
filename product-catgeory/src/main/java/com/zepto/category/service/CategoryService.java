package com.zepto.category.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.category.entity.CategoryEntity;
import com.zepto.category.repository.CategoryRepository;
import com.zepto.category.request.response.CategoryRequest;
import com.zepto.category.request.response.CategoryResponse;

@Service
public class CategoryService
{
	@Autowired
	CategoryRepository categoryRepository;

	public CategoryResponse createCategory(CategoryRequest categoryRequest)
	{
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setName(categoryRequest.getName());
		categoryEntity.setDescription(categoryRequest.getDescription());
		categoryEntity.setStatus("ACTIVE");
		CategoryEntity responseEntity = categoryRepository.save(categoryEntity);

		CategoryResponse categoryResponse = new CategoryResponse();
		categoryResponse.setId(responseEntity.getId());
		categoryResponse.setName(responseEntity.getName());
		categoryResponse.setDescription(responseEntity.getDescription());
		categoryResponse.setStatus(responseEntity.getStatus());
		
		return categoryResponse;
	}
	
	
	
	
	
	
	
	

}
