package com.example.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.example.entity.Cat;
import com.example.entity.CatVo;
import com.example.entity.catIn;
import com.example.mapper.CatMapper;
import com.example.service.CatService;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletResponse;
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
@RequestMapping("/cat")
public class CatController {
    @Autowired
    CatService catService;
    @Autowired
    CatMapper catMapper;

    @RequestMapping("/list")
    List<Cat> SelectAllCat() {
        List<Cat> cats = catService.list();
        return cats;
    }

    @RequestMapping("/selectCat{x}")
    public Cat selectCat(@PathVariable String x) {
        System.out.println(x);
        return catMapper.selectCat(x);
    }

    //定义一个controller类，
    @RequestMapping("/catspage")
    public CatVo getPage(@RequestParam(defaultValue = "1") Integer currentPage, @RequestParam(defaultValue = "10") Integer pageSize) {
        CatVo catVo = new CatVo();
        IPage<Cat> cartPage = catService.selectByPage(currentPage, pageSize);
        //System.out.println(cartPage+" "+cartPage.getRecords()+" "+cartPage.getTotal());
        catVo.setPages(cartPage.getPages());
        catVo.setLimit(pageSize);
        catVo.setTotal(cartPage.getTotal());
        catVo.setData(cartPage.getRecords());
        catVo.setCurrent(currentPage);
        //System.out.println(cartVo);
        return catVo;
    }

    @RequestMapping("/info")
    public List<catIn> getInfo() {
        return catMapper.getInfo();
    }

}

