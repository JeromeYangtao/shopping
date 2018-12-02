package com.study.shopping.web.cart.view;

import com.study.shopping.web.cart.model.CartItem;

import java.util.List;

public class ListCartItemResponse {
    private List<CartItem> items;

    public ListCartItemResponse() {
    }

    public ListCartItemResponse(List<CartItem> items) {
        this.items = items;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }
}
