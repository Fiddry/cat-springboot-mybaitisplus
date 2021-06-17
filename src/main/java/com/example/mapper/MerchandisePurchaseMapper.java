package com.example.mapper;

import com.example.entity.MerchandisePurchase;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Fiddry
 * @since 2021-06-15
 */
@Mapper
public interface MerchandisePurchaseMapper extends BaseMapper<MerchandisePurchase> {
    @Insert("EXEC pro_MerchandisePurchaseAddGoods '${goodsID}',${buyingQuantity}")
    boolean Insert1( @Param("goodsID") String goodsID, @Param("buyingQuantity") Integer buyingQuantity);

    @Insert("EXEC pro_MerchandisePurchaseAddItem '${itemsID}',${buyingQuantity}")
    boolean Insert2( @Param("itemsID") String itemID, @Param("buyingQuantity") Integer buyingQuantity);
}
