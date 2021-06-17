package com.example.controller;


import com.example.entity.CatToys;
import com.example.entity.CatToysi;
import com.example.mapper.CatToysMapper;
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
@RequestMapping("//catToys")
public class CatToysController {

    @Autowired
    CatToysMapper catToysMapper;


    @RequestMapping("/selectToys")
    public List<CatToysi> selectToys() {
        return catToysMapper.selectToys();
    }
}

