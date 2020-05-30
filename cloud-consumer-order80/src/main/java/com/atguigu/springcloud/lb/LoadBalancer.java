package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Copyright (C), 2020-2020, 慧牧科技有限公司
 * @Author: chuanxingchao
 * @Date: 2020/5/21 21:52
 * @Version: V1.0
 * @Description: 自己手写负载均衡算法接口类
 */

public interface LoadBalancer {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
