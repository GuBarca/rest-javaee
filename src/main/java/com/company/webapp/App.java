package com.company.webapp;

import java.util.List;

import com.company.webapp.model.Product;
import com.company.webapp.services.GenericDAO;
import com.company.webapp.services.ProductDAO;

public class App 
{

	public static void main( String[] args )
    {
    	Product p = new Product();
    	
    	p.setName("Produto 2");
    	p.setDescription("Descricao do produto 2");
    	p.setWidth(20);
    	p.setHeight(30);
    	p.setLength(10);
    	p.setActive(true);
    	
    	
    	
    	
    	ProductDAO pdao = new ProductDAO();

    	List<Product> products = pdao.getAll();
    	
    	for(Product product : products) {
    		System.out.println(product.getName());
    	}
    	
    	
    	
    }
}
