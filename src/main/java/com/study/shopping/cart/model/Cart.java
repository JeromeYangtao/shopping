package com.study.shopping.cart.model;

import com.study.shopping.product.model.Product;

//购物车
public class Cart {
    private Integer id;
    private String name;
    private Product[] products;

    public Cart(Integer id, String name, Product[] products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
