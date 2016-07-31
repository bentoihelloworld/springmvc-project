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

}
