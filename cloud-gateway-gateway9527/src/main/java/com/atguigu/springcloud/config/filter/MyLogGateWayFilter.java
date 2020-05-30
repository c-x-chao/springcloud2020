package com.atguigu.springcloud.config.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @Copyright (C), 2020-2020, 慧牧科技有限公司
 * @Author: chuanxingchao
 * @Date: 2020/5/29 21:30
 * @Version: V1.0
 * @Description: 自定义过滤器
 */
@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
       log.info("*********new MyLogGateWayFilter:"+new Date());
      //获取用户名
       String username = exchange.getRequest().getQueryParams().getFirst("username");
       if(username == null){
           log.info("********用户名为null，非法用户，嗷嗷哦啊哦啊啊哦");
           //返回一个失败状态
           exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
        return exchange.getResponse().setComplete();
       }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
