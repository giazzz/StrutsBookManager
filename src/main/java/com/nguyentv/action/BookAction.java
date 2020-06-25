package com.nguyentv.action;

import com.nguyentv.dao.BookDAO;
import com.nguyentv.entity.Bangsach;
import com.nguyentv.entity.Tacgia;
import com.opensymphony.xwork2.ActionSupport;

import java.awt.print.Book;
import java.util.List;

public class BookAction extends ActionSupport {
    private String tenSach;
    private String tomTat;
    private int maTG;
    private List<Tacgia> listTacGia;

    public String execute() {
        BookDAO dao = new BookDAO();
        Bangsach entity = new Bangsach();
        entity.setTenSach(tenSach);
        entity.setTomTat(tomTat);
        entity.setMaTg(maTG);
        dao.insertBook(entity);
        return "success";
    }

    @Override
    public void validate() {
        if(tenSach.isEmpty()){
            addFieldError("tenSach", "Tên sách không được để trống!");
        }else if(tomTat.isEmpty()){
            addFieldError("tomTat", "Tóm tắt không được để trống!");
        }
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTomTat() {
        return tomTat;
    }

    public void setTomTat(String tomTat) {
        this.tomTat = tomTat;
    }

    public List<Tacgia> getListTacGia() {
        return listTacGia;
    }

    public void setListTacGia(List<Tacgia> listTacGia) {
        this.listTacGia = listTacGia;
    }

    public int getMaTG() {
        return maTG;
    }

    public void setMaTG(int maTG) {
        this.maTG = maTG;
    }
}
