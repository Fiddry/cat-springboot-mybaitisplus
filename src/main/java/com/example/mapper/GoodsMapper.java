package com.example.mapper;

import com.example.entity.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Goodsi;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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
public interface GoodsMapper extends BaseMapper<Goods> {

    @Select("  SELECT goodsID\n" +
            "      ,goodsName\n" +
            "      ,salePrice\n" +
            "  FROM goods\n" +
            "  WHERE goodsID LIKE 'GA%'\n")
    List<Goodsi> selectGA();

    @Select("  SELECT goodsID\n" +
            "      ,goodsName\n" +
            "      ,salePrice\n" +
            "  FROM goods\n" +
            "  WHERE goodsID LIKE 'GD%'\n")
    List<Goodsi> selectGD();

    @Select("  SELECT goodsID\n" +
            "      ,goodsName\n" +
            "      ,salePrice\n" +
            "  FROM goods\n" +
            "  WHERE goodsID LIKE 'GS%'\n")
    List<Goodsi> selectGS();

    @Select("EXEC pro_SaleGoods '${x}'")
    void insertB(@Param("x") String x);
}
