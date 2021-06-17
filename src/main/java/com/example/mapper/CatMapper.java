package com.example.mapper;


import com.example.entity.Cat;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.catIn;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
public interface CatMapper extends BaseMapper<Cat> {

    @Select("EXEC pro_catSerch ${x}")
    Cat selectCat(@Param("x") String x);

    @Select("exec pro_CatInfo")
    List<catIn> getInfo();
}
