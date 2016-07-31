package com.bentoi.ai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.bentoi.ai.db.PersistenceManager;

public class ProductDao {

	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
 
    
    public List<Products> getAllProducts(){

    	TypedQuery<Products> query = em.createQuery(
                "SELECT p FROM Products p ORDER BY p.id", Products.class);
        	return query.getResultList();
    	
    }
    

    public void addProduct(Products Prdct){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
//    	Boolean isDataAdded = false;
		try {
			em.getTransaction().begin();
			em.persist(Prdct);
			em.getTransaction().commit();

//			isDataAdded = true;
		} catch (Exception e) {
			System.out.println("error when committing transaction: " + e.getMessage());
		}
		// PersistenceManager.INSTANCE.close();

    }

}
