package com.study.shopping.product.model;

public class UpdateProductResponse {

    private Product product;

    public UpdateProductResponse(){

    }

    public UpdateProductResponse(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
