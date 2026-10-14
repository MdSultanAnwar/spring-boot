package com.zepto.category.repository;

<<<<<<< HEAD
=======
import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
>>>>>>> 98abf0bc1ab98b91b111a691f0ca526a6ffd2549
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zepto.category.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Long>
{

<<<<<<< HEAD
=======
	@Query("SELECT c FROM CategoryEntity c LEFT JOIN FETCH c.products")
	// @EntityGraph(attributePaths = {"products"})
	public List<CategoryEntity> getAllCategories();
>>>>>>> 98abf0bc1ab98b91b111a691f0ca526a6ffd2549
}
