package com.testExec.dao;

import com.testExec.Entity.Goods;

import java.util.List;

public interface GoodsDao {

    List<Goods> findAll();

    void save (Goods order);

    Goods getById(int id);

    void update(Goods order);

    void delete(int id);

}
