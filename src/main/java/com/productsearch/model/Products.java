package com.productsearch.model;

import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Products {
private String unique_id;
private String crawl_timestamp;
private String product_url;

private String product_name;

private String product_category_tree;
private String pid;
private int retail_price;
private int discounted_price;
private String[] image;
private boolean is_FK_Advantage_product;
private String description;
private String product_rating;
private String overall_rating;
private String brand;
private String product_specifications;
public String getUnique_id() {
	return unique_id;
}
public void setUnique_id(String unique_id) {
	this.unique_id = unique_id;
}
public String getCrawl_timestamp() {
	return crawl_timestamp;
}
public void setCrawl_timestamp(String crawl_timestamp) {
	this.crawl_timestamp = crawl_timestamp;
}
public String getProduct_url() {
	return product_url;
}
public void setProduct_url(String product_url) {
	this.product_url = product_url;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public String getProduct_category_tree() {
	return product_category_tree;
}
public void setProduct_category_tree(String product_category_tree) {
	this.product_category_tree = product_category_tree;
}
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public int getRetail_price() {
	return retail_price;
}
public void setRetail_price(int retail_price) {
	this.retail_price = retail_price;
}
public int getDiscounted_price() {
	return discounted_price;
}
public void setDiscounted_price(int discounted_price) {
	this.discounted_price = discounted_price;
}

public String[] getImage() {
	return image;
}
public void setImage(String[] image) {
	this.image = image;
}
public boolean isIs_FK_Advantage_product() {
	return is_FK_Advantage_product;
}
public void setIs_FK_Advantage_product(boolean is_FK_Advantage_product) {
	this.is_FK_Advantage_product = is_FK_Advantage_product;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getProduct_rating() {
	return product_rating;
}
public void setProduct_rating(String product_rating) {
	this.product_rating = product_rating;
}
public String getOverall_rating() {
	return overall_rating;
}
public void setOverall_rating(String overall_rating) {
	this.overall_rating = overall_rating;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getProduct_specifications() {
	return product_specifications;
}
public void setProduct_specifications(String product_specifications) {
	this.product_specifications = product_specifications;
}





	
}
