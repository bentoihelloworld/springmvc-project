package com.bentoi.ai.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public enum PersistenceManager {

	INSTANCE;
	  private EntityManagerFactory emFactory;
	  private PersistenceManager() {
	    // persistence-unit element.
	    emFactory = Persistence.createEntityManagerFactory("jpa");
	  }
	  public EntityManager getEntityManager() {
	    return emFactory.createEntityManager();
	  }
	  public void close() {
	    emFactory.close();
	  }	

}
