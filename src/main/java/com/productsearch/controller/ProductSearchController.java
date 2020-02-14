package com.productsearch.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.productsearch.model.Products;
import com.productsearch.services.ProductSearchService;
@RestController
public class ProductSearchController {
     @Autowired
     ProductSearchService productSearchService;
	@GetMapping(value= "/getProducts/{searchstr}", produces ="application/json")
	public ResponseEntity<Object> getProducts(@PathVariable("searchstr") String searchstr){
		try {
		List<Products> products= productSearchService.getProducts(searchstr);
		if(products!=null) {
			return new ResponseEntity(products,HttpStatus.OK);
		}
		else {
			return new ResponseEntity("No products found or there is an issue",HttpStatus.NOT_FOUND);
		}
	}
	catch(Exception ex) {
		return new ResponseEntity("Some exception occured",HttpStatus.NO_CONTENT);
	}
}
}
