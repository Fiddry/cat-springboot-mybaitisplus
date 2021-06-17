package com.example.controller;
import com.example.entity.MerchandisePurchase;
import com.example.mapper.MerchandisePurchaseMapper;
import com.example.service.MerchandisePurchaseService;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("//merchandisePurchase")
public class MerchandisePurchaseController {
    @Autowired
    MerchandisePurchaseService merchandisePurchaseService;
    @Autowired
    MerchandisePurchaseMapper merchandisePurchaseMapper;


    String Merc2x = "Merc2x";

    @RequestMapping("/list")
    public List<MerchandisePurchase> list() {
        return merchandisePurchaseService.list();
    }

    //    @RequestMapping("/selectPurchase")
//    public void selectPurchase(@RequestBody List<MerchandisePurchase> merchandisePurchase ){
//        System.out.println(merchandisePurchase);
//            merchandisePurchaseService.saveBatch(merchandisePurchase);
//    }
    @RequestMapping("/addPurchase")

    public synchronized void addPurchase(@RequestBody i ax) {
        if (ax.itemID == null) {
            merchandisePurchaseMapper.Insert1(ax.goodsID, ax.buyingQuantity);

        } else if (ax.goodsID == null) {
            merchandisePurchaseMapper.Insert2( ax.itemID, ax.buyingQuantity);

        }

    }
}

@Data
@EqualsAndHashCode(callSuper = false)
class i {
    String goodsID;
    String itemID;
    Integer buyingQuantity;
}