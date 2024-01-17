package com.springmvc.dao;

import java.util.List;

import com.springmvc.entities.Product;

public interface ProductDao {
	
	// method to insert product into database 
	public void createProduct(Product product);
	
	// method to get all products from table
	public List<Product> getAllProducts();
	
	// method to delete single product based on id
	public void deleteProduct(int prodId);
	
	
	// method to get only one product 
	public Product getSingleProduct(int id);
	
	
	// method to update product based on id
	public void updateProduct(Product product);

}
