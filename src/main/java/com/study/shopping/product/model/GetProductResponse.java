package com.study.shopping.product.model;

public class GetProductResponse {
    private Product product;

    public GetProductResponse() {

    }

    public GetProductResponse(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
