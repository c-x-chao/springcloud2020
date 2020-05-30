package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Copyright (C), 2020-2020, 慧牧科技有限公司
 * @Author: chuanxingchao
 * @Date: 2020/5/21 22:02
 * @Version: V1.0
 * @Description: 对该类的描述
 */
@Component  //让容器能够扫描到相应的内容
public class MyLB implements LoadBalancer {
    //原子类，默认为0
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    //使用CAS和对比算法，获取访问总数
    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current>=2147483647  ? 0 : current+1;
        }while(!this.atomicInteger.compareAndSet(current,next));
        System.out.println("******第几次访问，次数next:"+next);
        return next;
    }
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
