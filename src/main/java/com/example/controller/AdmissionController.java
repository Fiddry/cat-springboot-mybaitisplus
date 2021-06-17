package com.example.controller;


import com.example.entity.Admission;
import com.example.mapper.AdmissionMapper;
import com.example.service.AdminService;
import com.example.service.AdmissionService;
import com.example.service.impl.AdmissionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Fiddry
 * @since 2021-06-15
 */
@RestController
@RequestMapping("/admission")
public class AdmissionController {
    @Autowired
    AdmissionService admissionService;
    @Autowired
    AdmissionMapper admissionMapper;

    @RequestMapping("/list")
    public List<Admission> list() {
        return admissionService.list();
    }


}

