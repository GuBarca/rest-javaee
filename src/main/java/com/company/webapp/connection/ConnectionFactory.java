package com.company.webapp.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ecommerce");
	private static EntityManager em = null;
	
	public static EntityManager getEntityManager() {

		em = emf.createEntityManager();
		return em;
	}
}
