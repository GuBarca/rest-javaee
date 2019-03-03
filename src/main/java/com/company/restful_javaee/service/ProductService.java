package com.company.restful_javaee.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.company.restful_javaee.dao.ProductDAO;
import com.company.restful_javaee.model.Product;

@Path("/products")
public class ProductService {
	
	ProductDAO pdao = new ProductDAO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProducts(){
		return pdao.getAll();
	}
	
	@GET
	@Path("/{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProduct(@PathParam("productId") long id) {
		return pdao.findById(id);
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Product saveProduct(Product product) {
		pdao.save(product);
		return product;
	}
	
	@PUT
	@Path("/{productId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Product updateProduct(Product product, @PathParam("productId") long id) {
		product.setId(id);
		pdao.update(product, id);
		return product;
	}
	
	@DELETE
	@Path("/{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void delete(@PathParam("productId") long id) {
		 pdao.delete(id);
		 //return "id: " + id;
	}
	
	
	
	
}



