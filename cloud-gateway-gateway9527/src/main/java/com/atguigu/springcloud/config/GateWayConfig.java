package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Copyright (C), 2020-2020, 慧牧科技有限公司
 * @Author: chuanxingchao
 * @Date: 2020/5/29 11:39
 * @Version: V1.0
 * @Description: 网关的代码编写
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        //调用配置文件中的" routes"属性
        RouteLocatorBuilder.Builder builder = routeLocatorBuilder.routes();
        //id,访问路径，访问的地址
        builder.route("path_route_atguigu",
                r -> r.path("/guonei")
                        .uri("https://news.baidu.com/guonei")).build();
        return builder.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder builder = routeLocatorBuilder.routes();
        builder.route("path_route_atguigu2", r -> r.path("/mil").uri("https://news.baidu.com/mil")).build();
        return builder.build();
    }

}
