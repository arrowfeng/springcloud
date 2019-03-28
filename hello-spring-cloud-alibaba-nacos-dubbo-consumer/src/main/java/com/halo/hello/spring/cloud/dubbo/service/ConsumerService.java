package com.halo.hello.spring.cloud.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.stereotype.Service;


/**
 * @author zhangdunfeng
 * @description
 * @date 2019-03-28 16:06
 */
@EnableDubbo
@Service
public class ConsumerService {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;


    public void test() {
        for (int i = 0; i < 10; i++) {
            System.out.println(demoService.sayName("小马哥（mercyblitz）"));
        }
    }
}
