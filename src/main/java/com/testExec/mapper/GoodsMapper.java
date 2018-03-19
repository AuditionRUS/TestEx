package com.testExec.mapper;

import com.testExec.Entity.Goods;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GoodsMapper implements RowMapper<Goods> {

    @Override
    public Goods mapRow(ResultSet resultSet, int i) throws SQLException {
        Goods goods = new Goods();
        goods.setId(resultSet.getInt("id"));
        goods.setName(resultSet.getString("name"));
        goods.setPrice(resultSet.getInt("price"));
        return goods;
    }
}
