package com.example.controller;


import com.example.entity.Admin;
import com.example.entity.CatCategory;
import com.example.service.AdminService;
import com.example.service.CatCategoryService;
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
@RequestMapping("//catCategory")
public class CatCategoryController {
    @Autowired
    CatCategoryService catCategoryService;

    @RequestMapping("/list")
    public List<CatCategory> list() {
        return catCategoryService.list();
    }
}

