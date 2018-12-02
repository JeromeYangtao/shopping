package com.study.shopping.web.order.view;

import com.study.shopping.web.order.model.Order;

public class GetOrderResponse {
    Order order;

    public GetOrderResponse(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
