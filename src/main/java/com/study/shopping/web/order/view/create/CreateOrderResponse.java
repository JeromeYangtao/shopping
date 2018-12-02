package com.study.shopping.web.order.view.create;

import com.study.shopping.web.order.model.Order;

public class CreateOrderResponse {
    Order order;

    public CreateOrderResponse() {
    }

    public CreateOrderResponse(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
