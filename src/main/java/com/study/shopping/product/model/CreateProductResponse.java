package com.study.shopping.product.model;

public class CreateProductResponse {
    private Product product;

    public CreateProductResponse() {

    }

    public CreateProductResponse(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
