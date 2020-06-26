package com.nguyentv.dao;

import com.nguyentv.entity.Bangsach;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class BookDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public List<Bangsach> getAllBook() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Bangsach> list = em.createQuery("select c from Bangsach c", Bangsach.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    public void insertBook(Bangsach bangsach) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(bangsach);
        em.getTransaction().commit();
        em.close();
    }
//    public void updateProduct(int id) {
//        em.getTransaction().begin();
//        Product p = em.find(Product.class, id);
//        p.setName("Iphone 5 updated");
//        em.getTransaction().commit();
//        em.close();
//    }

    public boolean deleteBook(int id) {
        em.getTransaction().begin();
        Bangsach b = em.find(Bangsach.class, id);
        if (b != null) {
            em.remove(b);
            em.getTransaction().commit();
            em.close();
            return true;
        }
        em.close();
        return false;
    }
}
