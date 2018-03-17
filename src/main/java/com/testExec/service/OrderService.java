package com.testExec.service;

import com.testExec.Entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> findAll();

    void save (Order order);

    Order getById(int id);

    void update(Order order);

    void delete(int id);

}
