package com.example.controller;


import com.example.entity.CatProducts;
import com.example.entity.Consumer;
import com.example.service.CatProductsService;
import com.example.service.ConsumerService;
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
@RequestMapping("//consumer")
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;

    @RequestMapping("/list")
    public List<Consumer> list() {
        return consumerService.list();
    }
}

