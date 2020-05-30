package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Copyright (C), 2020-2020, 慧牧科技有限公司
 * @Author: chuanxingchao
 * @Date: 2020/5/23 18:53
 * @Version: V1.0
 * @Description: 对该类的描述
 */
@Component
@FeignClient(value= "CLOUD-PROVIDER-SERVICE") //调用哪一个微服务
public interface PaymentFeignService {
    //查询数据
    @GetMapping(value = "/payment/get/{id}") //调用服务提供者的内容，url表明了调用的地址
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeOut() ;
}
