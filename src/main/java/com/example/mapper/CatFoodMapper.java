package com.example.mapper;

import com.example.entity.CatFood;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

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
public interface CatFoodMapper extends BaseMapper<CatFood> {
}
