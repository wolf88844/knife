package com.example.knife.com.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "Feign测试接口")
@RestController
@RequestMapping("Edu")
public class FeignController {

    @GetMapping("/test")
    public String test(HttpServletRequest request){
        String token = request.getParameter("token");
        String token1 = request.getHeader("token");
        return "this is Edu test,token==="+token+" headertoken="+token1;
    }
}
