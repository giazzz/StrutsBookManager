package com.nguyentv.dao;

import com.nguyentv.entity.Bangsach;
import com.nguyentv.entity.Tacgia;
import com.nguyentv.model.BookAuthor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public List<BookAuthor> getAllBook() {
        em = emf.createEntityManager();
        em.getTransaction().begin();

        List<BookAuthor> listBook = new ArrayList<BookAuthor>();

        List<Bangsach> list = em.createQuery("select c from Bangsach c", Bangsach.class).getResultList();
        em.getTransaction().commit();
        for (int i = 0; i < list.size(); i++) {
            int id = list.get(i).getMaSach();
            em.getTransaction().begin();
            Tacgia t = em.find(Tacgia.class, id);
            em.getTransaction().commit();
            BookAuthor b = new BookAuthor();
            b.setMaSach(list.get(i).getMaSach());
            b.setTenSach(list.get(i).getTenSach());
            b.setTomTat(list.get(i).getTomTat());
            b.setTenTG(t.getTenTacGia());
            b.setEmail(t.getEmail());
            listBook.add(b);
        }
        em.close();
        return listBook;
    }

    public void insertBook(Bangsach bangsach) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(bangsach);
        em.getTransaction().commit();
        em.close();
    }
}
