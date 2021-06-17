package com.example.mapper;

import com.example.entity.CashierOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.saleData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Fiddry
 * @since 2021-06-15
 */
@Mapper
public interface CashierOrderMapper extends BaseMapper<CashierOrder> {
    @Select("SELECT goods.goodsName as name ,SUM(CashierOrder.number) as value from goods join CashierOrder on goods.goodsID=CashierOrder.goodsId\n" +
            "group by goods.goodsName")
    List<saleData> selectSale();

}
