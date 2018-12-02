package com.study.shopping.web.order.view.update;

import com.study.shopping.web.order.model.Order;

public class UpdateOrderResponse {
    Order order;

    public UpdateOrderResponse() {
    }

    public UpdateOrderResponse(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
