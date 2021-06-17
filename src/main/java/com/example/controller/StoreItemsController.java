package com.example.controller;


import com.example.entity.CatProducts;
import com.example.entity.StoreItems;
import com.example.service.CatProductsService;
import com.example.service.StoreItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Fiddry
 * @since 2021-06-15
 */
@RestController
@RequestMapping("//storeItems")
public class StoreItemsController {
    @Autowired
    StoreItemsService storeItemsService;

    @RequestMapping("/list")
    public List<StoreItems> list() {
        return storeItemsService.list();
    }
}

