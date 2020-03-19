package com.sourcecode.balant.system.application.controller;

import com.sourcecode.balant.common.util.CommonResult;
import com.sourcecode.balant.system.api.SystemAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/system")
public class SystemAdminController {

    @Autowired
    private SystemAdminService systemAdminService;

    @GetMapping("/getusername")
    public CommonResult<String> test(HttpServletRequest request, HttpServletResponse response){
        String name = systemAdminService.getUserName();
        return CommonResult.success(name);
    }
}
