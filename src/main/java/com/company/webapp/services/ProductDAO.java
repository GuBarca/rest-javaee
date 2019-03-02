package com.company.webapp.services;

import javax.persistence.EntityManager;

import com.company.webapp.connection.ConnectionFactory;
import com.company.webapp.model.Product;

public class ProductDAO extends GenericDAO<Product>{

	
	public ProductDAO() {
		super(Product.class);
	}
	
	
	


}
