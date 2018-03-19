package com.testExec.service;

import com.testExec.Entity.Goods;
import com.testExec.dao.GoodsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    public GoodsDao goodsDao;

    @Override
    public List<Goods> findAll() {
        return goodsDao.findAll();
    }

    @Override
    public void save(Goods goods){
        if(goods.getName().length() < 2){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            goodsDao.save(goods);
        }

    }

    @Override
    public Goods getById(int id) {
        return goodsDao.getById(id);
    }

    @Override
    public void update(Goods goods) {
        goodsDao.update(goods);
    }

    @Override
    public void delete(int id) {
        goodsDao.delete(id);
    }
}
