package com.company.restful_javaee.dao;

import javax.persistence.EntityManager;

import com.company.restful_javaee.connection.ConnectionFactory;
import com.company.restful_javaee.model.Product;

public class ProductDAO extends GenericDAO<Product>{

	
	public ProductDAO() {
		super(Product.class);
	}
	
	
	


}
