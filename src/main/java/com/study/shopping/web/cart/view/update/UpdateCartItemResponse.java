package com.study.shopping.web.cart.view.update;

import com.study.shopping.web.cart.model.CartItem;

public class UpdateCartItemResponse {
    CartItem item;

    public UpdateCartItemResponse() {

    }

    public UpdateCartItemResponse(CartItem item) {
        this.item = item;
    }

    public CartItem getItem() {
        return item;
    }

    public void setItem(CartItem item) {
        this.item = item;
    }

}
