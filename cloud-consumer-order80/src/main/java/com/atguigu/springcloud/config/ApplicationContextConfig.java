package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * @Copyright (C), 2020-2020, 慧牧科技有限公司
 * @Author: chuanxingchao
 * @Date: 2020/5/18 19:05
 * @Version: V1.0
 * @Description: 对该类的描述
 */
@Configuration
public class ApplicationContextConfig {
    @Bean   //注解依赖注入
//    @LoadBalanced  //解决restTemplate的负载均衡
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }
}
