package com.testExec.service;

import com.testExec.Entity.Goods;

import java.util.List;

public interface GoodsService {

    List<Goods> findAll();

    void save (Goods goods) throws Exception;

    Goods getById(int id);

    void update(Goods goods);

    void delete(int id);

}
