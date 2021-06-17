package com.example.controller;


import com.example.entity.Drinks;
import com.example.service.DrinksService;
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
@RequestMapping("//drinks")
public class DrinksController {
    @Autowired
    DrinksService drinksService;

    @RequestMapping("/list")
    public List<Drinks> list(){
        return drinksService.list();
    }
}

