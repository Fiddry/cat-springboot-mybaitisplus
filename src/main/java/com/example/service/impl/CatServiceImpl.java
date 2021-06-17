package com.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.entity.Cat;
import com.example.mapper.CatMapper;
import com.example.service.CatService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Fiddry
 * @since 2021-06-15
 */
@Service("catService")
public class CatServiceImpl extends ServiceImpl<CatMapper, Cat> implements CatService {
    @Autowired
    private CatMapper catDao;  //注入Dao层

    @Override
    public IPage<Cat> selectByPage(int currentPage, int pageSize) {
        //查询对象
        //QueryWrapper<CartEntity> wrapper=new QueryWrapper<>();
        //分页，第一个参数是第几页，第二个是每页多少条数据
        Page<Cat> page=new Page<>(currentPage,pageSize);
        //
        IPage<Cat> cartIpage =catDao.selectPage(page,null);
        return cartIpage;
    }
}
