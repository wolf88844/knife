package com.example.knife.com.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户对象")
@Data
public class UserVo {
    @ApiModelProperty(required = true,notes = "用户名",example = "blues")
    private String name;
    @ApiModelProperty(required = true,notes = "用户返回消息",example = "hello world")
    private String words;
    @ApiModelProperty(required = true,notes = "用户密码")
    private String passWord;

    public UserVo(String name,String words,String passWord){
        this.name = name;
        this.words = words;
        this.passWord = passWord;
    }
}
