package com.bentoi.ai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bentoi.ai.model.Products;


@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Products> getAllProducts() {

		TypedQuery<Products> query = em.createQuery("SELECT p FROM Products p ORDER BY p.id", Products.class);
		
		return query.getResultList();

	}

	public void addProduct(Products Prdct) {

		// Boolean isDataAdded = false;
		try {
			em.persist(Prdct);
		
			// isDataAdded = true;
		} catch (Exception e) {
			System.out.println("error when committing transaction: " + e.getMessage());
		}
		// PersistenceManager.INSTANCE.close();

	}

}
