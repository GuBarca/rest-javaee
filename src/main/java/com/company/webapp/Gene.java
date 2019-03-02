package com.company.webapp;

public class Gene<T> {
	
	private T t;
	
	public void show() {
		System.out.println("A classe que você está usando é: " + t.getClass().getName());
	}
}
