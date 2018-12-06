package com.study.shopping.web.cart.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartItemDao extends CrudRepository<CartItem,Long> {
    CartItem getById(long id);

    List<CartItem> findAll();

    CartItem save(CartItem product);
}
