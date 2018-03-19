package com.testExec.dao;

import com.testExec.Entity.Goods;
import com.testExec.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GoodsDaoImpl implements GoodsDao {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public GoodsDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Goods> findAll() {
        String sql = "SELECT * FROM goods";
        return jdbcTemplate.query(sql, new GoodsMapper());
    }

    @Override
    public void save(Goods goods) {
        String sql = "INSERT INTO goods (name,price) VALUES (?,?)";
        jdbcTemplate.update(sql, goods.getName(), goods.getPrice());
    }

    @Override
    public Goods getById(int id) {
        String sql = "SELECT * FROM goods WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new GoodsMapper(), id);
    }

    @Override
    public void update(Goods goods) {
        String sql = "UPDATE goods SET name=?,price=? WHERE id=?";
        jdbcTemplate.update(sql, goods.getName(),goods.getPrice(),goods.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM goods WHERE id=?";
        jdbcTemplate.update(sql, id);
    }
}
