package com.nguyentv.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "bangsach")
public class Bangsach {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "MaSach")
    private Integer maSach;

    @Column(name = "TenSach")
    private String tenSach;

    @Column(name = "TomTat")
    private String tomTat;

    @Column(name = "MaTG")
    private Integer maTg;

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

    public Integer getMaTg() {
        return maTg;
    }

    public void setMaTg(Integer maTg) {
        this.maTg = maTg;
    }

}
