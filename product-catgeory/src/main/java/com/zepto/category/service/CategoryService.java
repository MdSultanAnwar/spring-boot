package com.zepto.category.service;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> 98abf0bc1ab98b91b111a691f0ca526a6ffd2549
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.category.entity.CategoryEntity;
import com.zepto.category.repository.CategoryRepository;
import com.zepto.category.request.response.CategoryRequest;
import com.zepto.category.request.response.CategoryResponse;
<<<<<<< HEAD
=======
import com.zepto.product.entity.ProductEntity;
>>>>>>> 98abf0bc1ab98b91b111a691f0ca526a6ffd2549

@Service
public class CategoryService
{
	@Autowired
	CategoryRepository categoryRepository;

<<<<<<< HEAD
=======
	// total 6 queries --> N categories --> N+1
	public void showAllCategories()
	{
		System.out.println("CategoryService.showAllCategories() ::::::::::::::: START:");
		// Iterable<CategoryEntity> categories = categoryRepository.findAll(); // This
		// fired one query to get all the categories
		
		List<CategoryEntity> categories = categoryRepository.getAllCategories();
		
		for (CategoryEntity categoryEntity : categories)
		{
			System.out.println(categoryEntity.getName());
			System.out.println(categoryEntity.getId());

			// one query per category (Here total 5 queries)
			List<ProductEntity> products = categoryEntity.getProducts(); // Please get the child as well

			System.out.println("Total products are  : " + products.size());

		}
		System.out.println("CategoryService.showAllCategories() ::::::::::::::: END:");

	}

>>>>>>> 98abf0bc1ab98b91b111a691f0ca526a6ffd2549
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
<<<<<<< HEAD
		
		return categoryResponse;
	}
	
	
	
	
	
	
	
	
=======

		return categoryResponse;
	}
>>>>>>> 98abf0bc1ab98b91b111a691f0ca526a6ffd2549

}
