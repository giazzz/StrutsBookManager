package com.nguyentv.action;

import com.nguyentv.dao.BookDAO;
import com.nguyentv.entity.Bangsach;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class DeleteAction extends ActionSupport {
    private int id;

    public String execute() {
        BookDAO dao = new BookDAO();
        if (dao.deleteBook(id)) {
            return "success";
        }else {
            return "bad";
        }

    }
}
