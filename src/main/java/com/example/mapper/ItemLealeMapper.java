package com.example.mapper;

import com.example.entity.ItemLeale;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Fiddry
 * @since 2021-06-15
 */
@Mapper
public interface ItemLealeMapper extends BaseMapper<ItemLeale> {
    @Insert("EXEC pro_CatToyBroow '${x}'")
    void insert(@Param("x") String x);
}
