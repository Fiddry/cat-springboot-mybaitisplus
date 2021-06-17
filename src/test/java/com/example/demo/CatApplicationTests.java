package com.example.demo;

import com.example.catApplication;
import com.example.controller.CatController;
import com.example.controller.MerchandisePurchaseController;
import com.example.mapper.AdmissionMapper;
import com.example.mapper.CatMapper;
import com.example.mapper.GoodsMapper;
import com.example.service.GoodsService;
import com.example.service.SaleGoodsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = catApplication.class)
//@Run
class CatApplicationTests {

    @Autowired
    CatController catController;
    @Autowired
    GoodsMapper goodsMapper;
    @Autowired
    CatMapper catMapper;
    @Autowired
    GoodsService goodsService;
    @Autowired
    SaleGoodsService saleGoodsService;
    @Autowired
    MerchandisePurchaseController merchandisePurchaseController;

    @Test
    void contextLoads() {
    }


    @Test
    void allCat() {
        System.out.println(catController.getPage(1, 10));

    }

    @Test
    void GA() {
        System.out.println(goodsMapper.selectGA());
    }

    @Test
    void C() {
        System.out.println(catMapper.selectCat("Ca19081603"));
    }

    @Test
    void Cs() {
        System.out.println(catController.selectCat("Ca19081603"));
    }

    @Test
    void C1s() {
//       merchandisePurchaseController.addPurchase("SIcatf0003", 2);
    }
}
