package com.study.shopping.web.cart.view;

import com.study.shopping.web.cart.model.CartItem;

public class GetCartItemResponse {
    CartItem item;

    public GetCartItemResponse() {
    }

    public GetCartItemResponse(CartItem item) {
        this.item = item;
    }

    public CartItem getItem() {
        return item;
    }

    public void setItem(CartItem item) {
        this.item = item;
    }
}
