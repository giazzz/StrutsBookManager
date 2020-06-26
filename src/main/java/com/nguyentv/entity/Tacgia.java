package com.nguyentv.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tacgia")
public class Tacgia {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "MaTG")
    private Integer maTg;

    @Column(name = "TenTacGia")
    private String tenTacGia;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "SDT")
    private String sdt;

    @Column(name = "Email")
    private String email;

    @OneToMany(mappedBy = "tacgia")
    private List<Bangsach> listBook;

    public List<Bangsach> getListBook() {
        return listBook;
    }

    public void setListBook(List<Bangsach> listBook) {
        this.listBook = listBook;
    }

    public Integer getMaTg() {
        return maTg;
    }

    public void setMaTg(Integer maTg) {
        this.maTg = maTg;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
