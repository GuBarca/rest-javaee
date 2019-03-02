package com.company.webapp.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.company.webapp.connection.ConnectionFactory;
import com.company.webapp.model.Product;

public class GenericDAO<Entity> {
	


	
	private final Class<Entity> entity = null;
	
	private static EntityManager em = ConnectionFactory.getEntityManager();

	
	public void findById(Entity entity, int id){
		
		System.out.println(entity.getClass());
		//return em.find(entityClass, primaryKey);
	}
	
	public void save(Entity entity) {
		em.getTransaction().begin();;
		em.persist(entity);
		em.getTransaction().commit();
	}
	
	
	
	
	

}
