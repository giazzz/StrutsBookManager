package com.nguyentv.action;

import com.nguyentv.dao.BookDAO;
import com.nguyentv.entity.Bangsach;
import com.nguyentv.model.BookAuthor;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class ListAction extends ActionSupport {
    private List<BookAuthor> products;

    public String execute() {
        BookDAO dao = new BookDAO();
        products = dao.getAllBook();
        if (products.size() > 0) {
            return "success";
        }else {
            return "bad";
        }

    }

    public List<BookAuthor> getProducts() {
        return products;
    }

    public void setProducts(List<BookAuthor> products) {
        this.products = products;
    }
}
