package com.springmvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.springmvc.entities.Product;

@Component
public class ProductDaoImp implements ProductDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	// inserting / saving product into database table
	@Transactional
	public void createProduct(Product product)
	{
		hibernateTemplate.save(product);
	}
	
	
	// getting all products from database table
	public List<Product> getAllProducts()
	{
		List<Product> products = hibernateTemplate.loadAll(Product.class);
		return products;
	}


	// deleting single product 
	@Transactional
	public void deleteProduct(int prodctid) {
		Product prod = hibernateTemplate.load(Product.class,prodctid);
		hibernateTemplate.delete(prod);
		
	}

	// gettting sinle product for updating
	public Product getSingleProduct(int id)
	{
		Product prd = hibernateTemplate.get(Product.class, id);
		return prd;
	}

	
	// update single product
	@Transactional
	public void updateProduct(Product product) {
		 hibernateTemplate.saveOrUpdate(product);
		
	}
	

}
