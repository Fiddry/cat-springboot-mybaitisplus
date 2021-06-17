package com.example.service.impl;

import com.example.entity.CatProducts;
import com.example.mapper.CatProductsMapper;
import com.example.service.CatProductsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Fiddry
 * @since 2021-06-15
 */
@Service
public class CatProductsServiceImpl extends ServiceImpl<CatProductsMapper, CatProducts> implements CatProductsService {

}
