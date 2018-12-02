package com.study.shopping.web.order.controller;

import com.study.shopping.web.order.view.GetOrderResponse;
import com.study.shopping.web.order.view.ListOrderResponse;
import com.study.shopping.web.order.view.create.CreateOrderRequest;
import com.study.shopping.web.order.view.create.CreateOrderResponse;
import com.study.shopping.web.order.view.update.UpdateOrderRequest;
import com.study.shopping.web.order.view.update.UpdateOrderResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
public class OrderController {
    /**
     * list orders
     */
    @GetMapping("/orders")
    public ResponseEntity<ListOrderResponse> listOrders() {
        return new ResponseEntity<>(new ListOrderResponse(), HttpStatus.OK);
    }

    /**
     * Get order
     */
    @GetMapping("/products/{orderId}")
    public ResponseEntity<GetOrderResponse> getOrder(@PathVariable String orderId) throws SQLException {
        return new ResponseEntity<>(new GetOrderResponse(), HttpStatus.OK);
    }

    /**
     * Create order
     */
    @PostMapping("/orders")
    public ResponseEntity<CreateOrderResponse> CreateOrder(@RequestBody CreateOrderRequest createOrderRequest) {
        return new ResponseEntity<>(new CreateOrderResponse(), HttpStatus.CREATED);
    }

    /**
     * Update order
     */
    @PutMapping("/products/{orderId}")
    public ResponseEntity<UpdateOrderResponse> UpdateOrder(@PathVariable String orderId, @RequestBody UpdateOrderRequest updateOrderRequest) {
        return new ResponseEntity<>(new UpdateOrderResponse(), HttpStatus.OK);
    }
}
