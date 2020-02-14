package com.productsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;







@SpringBootApplication

@EnableEurekaClient
//@ComponentScan(basePackages = {"com.microservices.gateway","com.userauthentication"})
@ComponentScan(basePackages = {"com"})
@EnableMongoRepositories(basePackages = {"com.productsearch.repository"})
public class ProductSearchApplication {
public static void main(String[] args) {
		
		
	SpringApplication.run(ProductSearchApplication.class, args);
	}

}
