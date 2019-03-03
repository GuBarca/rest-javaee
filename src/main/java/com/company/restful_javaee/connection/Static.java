package com.company.restful_javaee.connection;

public class Static {
	private static String name;
	
	public static void setName(String name) {
		Static.name = name;
	}
	
	public static String getName() {
		return name;
	}
	
}
