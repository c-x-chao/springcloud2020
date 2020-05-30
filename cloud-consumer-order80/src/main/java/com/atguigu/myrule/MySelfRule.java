package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Copyright (C), 2020-2020, 慧牧科技有限公司
 * @Author: chuanxingchao
 * @Date: 2020/5/21 20:51
 * @Version: V1.0
 * @Description: 手动更改负载均衡算法，默认为轮询，改为随机
 *                  需要在启动类添加一个注解
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //默认为轮询
        return new RandomRule();//定义为随机
    }
}
