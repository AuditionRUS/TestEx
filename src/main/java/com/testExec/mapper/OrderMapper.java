package com.testExec.mapper;

import com.testExec.Entity.Order;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper<Order> {

    @Override
    public Order mapRow(ResultSet resultSet, int i) throws SQLException {
        Order order = new Order();
        order.setId(resultSet.getInt("id"));
        order.setClient(resultSet.getString("client"));
        order.setDate(resultSet.getString("date"));
        order.setAddress(resultSet.getString("address"));
        return order;
    }
}
