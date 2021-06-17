package com.example.controller;


import com.example.entity.Admin;
import com.example.entity.CatDietManagement;
import com.example.service.AdminService;
import com.example.service.CatDietManagementService;
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
@RequestMapping("//catDietManagement")
public class CatDietManagementController {
    @Autowired
    CatDietManagementService catDietManagementService;

    @RequestMapping("/list")
    public List<CatDietManagement> list() {
        return catDietManagementService.list();
    }
}

