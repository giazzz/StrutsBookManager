package com.nguyentv.model;

import com.nguyentv.entity.Bangsach;

import javax.persistence.Column;

public class BookAuthor {
    private Integer maSach;
    private String tenSach;
    private String tomTat;
    private String tenTG;
    private String email;

    public BookAuthor() {
    }

    public BookAuthor(Integer maSach, String tenSach, String tomTat, String tenTG, String email) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tomTat = tomTat;
        this.tenTG = tenTG;
        this.email = email;
    }

    public Integer getMaSach() {
        return maSach;
    }

    public void setMaSach(Integer maSach) {
        this.maSach = maSach;
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

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
