package com.example.service.impl;

import com.example.entity.Admission;
import com.example.mapper.AdmissionMapper;
import com.example.service.AdmissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
@Service
public class AdmissionServiceImpl extends ServiceImpl<AdmissionMapper, Admission> implements AdmissionService {

}
