package com.nguyentv.dao;

import com.nguyentv.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProductDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public void insertProduct(Product product) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(product);
        em.getTransaction().commit();
        em.close();
    }

    public List<Product> getAllProduct() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Product> list = em.createQuery("select c from Product c", Product.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

}
