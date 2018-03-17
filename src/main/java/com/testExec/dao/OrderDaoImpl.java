package com.testExec.dao;

import com.testExec.Entity.Order;
import com.testExec.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class OrderDaoImpl implements OrderDao {
//Имя таблицы Order - недопустимо, потому таблица называется Orders
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public OrderDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Order> findAll() {
        String sql = "SELECT * FROM orders";
        return jdbcTemplate.query(sql, new OrderMapper());
    }

    @Override
    public void save(Order order) {
        String sql = "INSERT INTO orders (client,date,address) VALUES (?,?,?)";
        jdbcTemplate.update(sql, order.getClient(),order.getDate(),order.getAddress());
    }

    @Override
    public Order getById(int id) {
        String sql = "SELECT * FROM orders WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new OrderMapper(), id);
    }

    @Override
    public void update(Order order) {
        String sql = "UPDATE orders SET client=?,date=?,address=? WHERE id=?";
        jdbcTemplate.update(sql, order.getClient(),order.getDate(),order.getAddress(),order.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM orders WHERE id=?";
        jdbcTemplate.update(sql, id);
    }


}
