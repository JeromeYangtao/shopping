package com.study.shopping.web.order.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao extends CrudRepository<Order,Long> {

    Order getById();

    List<Order> findAll();

    Order save(Order order);
}
