package com.study.shopping.web.order.model;

import com.study.shopping.web.product.model.Product;
import com.study.shopping.web.user.model.User;

//订单
public class Order {
    private long id;
    private User user;
    private Product product;
    private long quantity;
    private String status;
    private String address;

    public Order(User user, Product product, long quantity, String status, String address) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
