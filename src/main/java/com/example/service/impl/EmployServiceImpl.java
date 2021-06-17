package com.example.service.impl;

import com.example.entity.Employ;
import com.example.mapper.EmployMapper;
import com.example.service.EmployService;
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
public class EmployServiceImpl extends ServiceImpl<EmployMapper, Employ> implements EmployService {

}
