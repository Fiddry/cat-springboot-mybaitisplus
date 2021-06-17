package com.example.controller;


import com.example.entity.Goods;
import com.example.entity.Goodsi;
import com.example.mapper.GoodsMapper;
import com.example.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Fiddry
 * @since 2021-06-15
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @Autowired
    GoodsMapper goodsMapper;

    @RequestMapping("/list")
    public List<Goods> list() {
        List<Goods> goods = goodsService.list();
        return goods;
    }

    @RequestMapping("/selectGA")
    public List<Goodsi> selectGA() {
        List<Goodsi> goods = goodsMapper.selectGA();
        return goods;
    }

    @RequestMapping("/selectGD")
    public List<Goodsi> selectGD() {
        List<Goodsi> goods = goodsMapper.selectGD();
        return goods;
    }

    @RequestMapping("/selectGS")
    public List<Goodsi> selectGS() {
        List<Goodsi> goods = goodsMapper.selectGS();
        return goods;
    }

    @RequestMapping("/backID{ID}")
    public void boughtGoodsId(@PathVariable String ID){
    goodsMapper.insertB(ID);
    }
}


