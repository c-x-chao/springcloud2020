package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @Copyright (C), 2020-2020, 慧牧科技有限公司
 * @Author: chuanxingchao
 * @Date: 2020/5/23 21:48
 * @Version: V1.0
 * @Description: openfeign 打印日志功能配置
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        //详细日志
        return Logger.Level.FULL;
    }
}
