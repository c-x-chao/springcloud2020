package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Copyright (C), 2020-2020, 慧牧科技有限公司
 * @Author: chuanxingchao
 * @Date: 2020/5/18 18:54
 * @Version: V1.0
 * @Description: 对该类的描述
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private int code;
    private String message;
    private T data;

    public CommonResult(int code, String message){
        this(code,message,null);
    }
}
