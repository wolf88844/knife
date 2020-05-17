package com.example.knife.com.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.knife.com.Results;
import com.example.knife.com.vo.UserVo;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试功能接口")
@RestController
public class HelloController {

    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "用户名称",required = true,dataType = "String",paramType = "path",example = "blues")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "接口返回成功状态"),
            @ApiResponse(code = 500,message = "接口返回未知错误，请联系开发人员")
    })
    @ApiOperation(value = "hello 测试接口",notes = "访问此接口，返回hello语句，测试接口")
    @GetMapping("hello/{name}")
    public Results hello(@PathVariable String name){
        UserVo userVo = new UserVo(name,"hello "+name,"11111");
        Results results = new Results(200,"SUCCESS",userVo);
        return results;
    }
}
