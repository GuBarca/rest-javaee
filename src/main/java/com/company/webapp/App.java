package com.company.webapp;

import com.company.webapp.model.Product;
import com.company.webapp.services.GenericDAO;
import com.company.webapp.services.ProductDAO;

public class App 
{

	public static void main( String[] args )
    {
    	Product p = new Product();
    	ProductDAO pdao = new ProductDAO();
    	
    	pdao.findById(p, 2);

    }
}
