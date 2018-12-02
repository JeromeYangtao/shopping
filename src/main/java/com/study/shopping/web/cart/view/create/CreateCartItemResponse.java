package com.study.shopping.web.cart.view.create;

import com.study.shopping.web.cart.model.CartItem;

public class CreateCartItemResponse {
    CartItem item;

    public CreateCartItemResponse() {
    }

    public CreateCartItemResponse(CartItem item) {

        this.item = item;
    }

    public CartItem getItem() {
        return item;
    }

    public void setItem(CartItem item) {
        this.item = item;
    }
}
