package com.example.mapper;

import com.example.entity.CatToys;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.CatToysi;
import com.example.entity.Goodsi;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Fiddry
 * @since 2021-06-15
 */
@Mapper
public interface CatToysMapper extends BaseMapper<CatToys> {
    @Select("SELECT   \n" +
            "   DISTINCT itemsName\n" +
            "   , itemsID\n" +
            "      ,[remindNumber]     \n" +
            "  FROM [test].[dbo].[CatToys]\n" +
            "   WHERE remindNumber >0\n")
    List<CatToysi> selectToys();
}
