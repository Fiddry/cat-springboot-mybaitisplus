package com.example.controller;


import com.example.entity.CatProducts;
import com.example.entity.RawMaterial;
import com.example.service.CatProductsService;
import com.example.service.RawMaterialService;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
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
@RequestMapping("//rawMaterial")
public class RawMaterialController {
    @Autowired
    RawMaterialService rawMaterialService;

    @RequestMapping("/list")
    public List<RawMaterial> list() {
        return rawMaterialService.list();
    }
}

