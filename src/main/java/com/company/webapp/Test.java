package com.company.webapp;

import com.company.webapp.model.Product;

public class Test<E> {
	
	private EntityManage em = new EntityManage();
	
	public void test() {
		Product p = new Product();
		Gene<Product> g = new Gene<>();
		em.find(g);
	}

}
