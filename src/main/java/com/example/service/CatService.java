package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.entity.Cat;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Fiddry
 * @since 2021-06-15
 */
@Service
public interface CatService extends IService<Cat> {
    /**
     * 分页操作
     * @param currentPage
     * @param limit
     * @return
     */
    IPage<Cat> selectByPage(int currentPage, int limit);  //定义分页功能
}
