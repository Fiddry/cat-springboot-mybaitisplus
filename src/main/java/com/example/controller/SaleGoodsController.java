package com.example.controller;


import com.example.entity.SaleGoods;
import com.example.service.SaleGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
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
@RequestMapping("//saleGoods")
public class SaleGoodsController {
    @Autowired
    SaleGoodsService saleGoodsService;

    @RequestMapping("/list")
    public List<SaleGoods> list() {
        return saleGoodsService.list();
    }
}

