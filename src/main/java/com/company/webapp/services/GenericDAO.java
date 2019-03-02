package com.company.webapp.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.company.webapp.connection.ConnectionFactory;
import com.company.webapp.model.Product;

public class GenericDAO<Entity> {
	
	private static EntityManager em = ConnectionFactory.getEntityManager();
	private Class<Entity> entity;	
	
	
	// Constructor
	//Get the static Class of the DAO who extends this Generic class, for use in methods that have return, and use the static class
	public GenericDAO(Class<Entity> e) {
		this.entity = e;
	}
	
	public Entity findById(long id){
		Entity e = em.find(entity, id);
		
		if(e == null) {
			throw new NullPointerException("Cannot find the entity in the database");
		}else {
			return e;
		}
		
	}
	
	public List<Entity> getAll(){
		List<Entity> entities = null;
		Query query = em.createQuery("SELECT e FROM " + entity.getSimpleName() + " e");
		entities = query.getResultList();
		
		return entities;
		
	}
	
	public void save(Entity entity) {
		em.getTransaction().begin();;
		em.persist(entity);
		em.getTransaction().commit();
	}
	
	public void remove(long id){
		Entity e = findById(id);
		
		if(e != null) {
			em.getTransaction().begin();
			em.remove(e);
			em.getTransaction().commit();
		}else {
			throw new NullPointerException("Cannot find the entity in the database");
		}
		
	}
	
}
