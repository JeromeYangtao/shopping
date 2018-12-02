package com.study.shopping.web.cart.controller;

import com.study.shopping.web.cart.view.GetCartItemResponse;
import com.study.shopping.web.cart.view.ListCartItemResponse;
import com.study.shopping.web.cart.view.create.CreateCartItemRequest;
import com.study.shopping.web.cart.view.create.CreateCartItemResponse;
import com.study.shopping.web.cart.view.update.UpdateCartItemRequest;
import com.study.shopping.web.cart.view.update.UpdateCartItemResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
public class CartController {
    /**
     * list cartItems
     */
    @GetMapping("/cartItems")
    public ResponseEntity<ListCartItemResponse> listCartItems() {
        return new ResponseEntity<>(new ListCartItemResponse(), HttpStatus.OK);
    }

    /**
     * Get cartItem
     */
    @GetMapping("/products/{cartItemId}")
    public ResponseEntity<GetCartItemResponse> getCartItem(@PathVariable String cartItemId) throws SQLException {
        return new ResponseEntity<>(new GetCartItemResponse(), HttpStatus.OK);
    }

    /**
     * Create cartItem
     */
    @PostMapping("/cartItems")
    public ResponseEntity<CreateCartItemResponse> CreateCartItem(@RequestBody CreateCartItemRequest createCartItemRequest) {
        return new ResponseEntity<>(new CreateCartItemResponse(), HttpStatus.CREATED);
    }

    /**
     * Update cartItem
     */
    @PutMapping("/products/{cartItemId}")
    public ResponseEntity<UpdateCartItemResponse> UpdateCartItem(@PathVariable String cartItemId, @RequestBody UpdateCartItemRequest updateCartItemRequest) {
        return new ResponseEntity<>(new UpdateCartItemResponse(), HttpStatus.OK);
    }
}
