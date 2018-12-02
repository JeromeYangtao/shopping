package com.study.shopping.cart.model;

import com.study.shopping.product.model.Product;
import com.study.shopping.user.model.User;

public class CartItem {
    private long id;
    private User user;
    private Product product;
    private long quantity;

    public CartItem(User user, Product product, long quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
