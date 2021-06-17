package com.example.controller;


import com.example.entity.CashierOrder;
import com.example.entity.saleData;
import com.example.mapper.CashierOrderMapper;
import com.example.service.CashierOrderService;
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
@RequestMapping("//cashierOrder")
public class CashierOrderController {
    @Autowired
    CashierOrderService cashierOrderService;
    @Autowired
    CashierOrderMapper cashierOrderMapper;

    @RequestMapping("/list")
    public List<CashierOrder> list() {
        return cashierOrderService.list();
    }

    @RequestMapping("/selectSale")
    public List<saleData> selectSale(){
        System.out.println(cashierOrderMapper.selectSale());
        return cashierOrderMapper.selectSale();
    }
}

