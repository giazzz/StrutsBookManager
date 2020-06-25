package com.nguyentv.action;

import com.nguyentv.dao.ProductDAO;
import com.nguyentv.entity.Product;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport {
    private String name;
    private int quantity;
    private int price;
    private Boolean checkBox;
    private String gender;
    private String color;


    public String execute() {
//        ProductDAO dao = new ProductDAO();
//        Product entity = new Product();
//        entity.setName(name);
//        entity.setPrice(price);
//        entity.setQuantity(quantity);
//        entity.setCategoryId(1);
//        dao.insertProduct(entity);
        return "success";
    }

    @Override
    public void validate() {
        if(name.length() < 5){
            addFieldError("name", "Toi thieu 5 ky tu");
        }else if(quantity < 3){
            addFieldError("quantity", "Quantity phai lon hon 3");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(Boolean checkBox) {
        this.checkBox = checkBox;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
