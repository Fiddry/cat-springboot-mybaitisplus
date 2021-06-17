package com.example.controller;


import com.example.entity.Admin;
import com.example.entity.CatIitemDisinfectionRecord;
import com.example.service.CatIitemDisinfectionRecordService;
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
@RequestMapping("//catIitemDisinfectionRecord")
public class CatIitemDisinfectionRecordController {
    @Autowired
    CatIitemDisinfectionRecordService catIitemDisinfectionRecordService;

    @RequestMapping("/list")
    public List<CatIitemDisinfectionRecord> list() {
        return catIitemDisinfectionRecordService.list();
    }
}

