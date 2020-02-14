package com.productsearch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productsearch.model.Products;

import com.productsearch.repository.ProductsRepository;

@Service
public class ProductSearchService {

	@Autowired
	ProductsRepository productSearchRepository;
	public List<Products> getProducts(String str){
		return productSearchRepository.findAllProductsBySerachString(str);
	}
}
