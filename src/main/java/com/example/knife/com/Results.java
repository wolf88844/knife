package com.example.knife.com;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("通用接口返回对象")
@Data
public class Results {
    @ApiModelProperty(required = true,notes = "结果码",example = "200")
    private int state;
    @ApiModelProperty(required = true,notes = "时间戳",example = "1567425139000")
    private long time;
    @ApiModelProperty(required = true,notes = "返回信息",example = "SUCCESS")
    private String message;
    @ApiModelProperty(required = true,notes = "返回数据",example = "{\"name\":\"bules\"}")
    private Object content;

    public Results(int code,String msg,Object obj){
        setState(code);
        setMessage(msg);
        setContent(obj);
        setTime(System.currentTimeMillis());
    }
}
