package com.example.controller;


import com.example.entity.CatProducts;
import com.example.entity.ItemLeale;
import com.example.mapper.ItemLealeMapper;
import com.example.service.CatProductsService;
import com.example.service.ItemLealeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("//itemLeale")
public class ItemLealeController {
    @Autowired
    ItemLealeService itemLealeService;
    @Autowired
    ItemLealeMapper itemLealeMapper;

    @RequestMapping("/list")
    public List<ItemLeale> list() {
        return itemLealeService.list();
    }
    @Transactional
    @RequestMapping("/addRent{id}")
    public void addRent(@PathVariable String id) {
        System.out.println(id);
        itemLealeMapper.insert(id);
    }
}

