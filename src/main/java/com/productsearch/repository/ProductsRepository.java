package com.productsearch.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.productsearch.model.Products;
@Repository
public interface ProductsRepository extends MongoRepository<Products,String> {

	@Query("{$text: {$search: ?0}}")
	public List<Products> findAllProductsBySerachString(String str);
	
	
}
