package com.vb.controller;

import com.vb.entity.VbResult;
import com.vb.service.VbManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class VbController {
    @Resource
    private VbManageService vbManageService;

//    获取virtualbox版本
    @RequestMapping("vb/version")
    @ResponseBody
    public VbResult getVersion(){
        return vbManageService.getVBoxVersion();
    }




}
