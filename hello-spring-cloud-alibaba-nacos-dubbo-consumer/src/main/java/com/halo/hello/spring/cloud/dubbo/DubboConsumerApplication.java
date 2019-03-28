package com.halo.hello.spring.cloud.dubbo;

import com.halo.hello.spring.cloud.dubbo.service.ConsumerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * @author zhangdunfeng
 * @description
 * @date 2019-03-28 16:01
 */

@SpringBootApplication
public class DubboConsumerApplication implements CommandLineRunner {

    @Resource
    private ConsumerService consumerService;

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        consumerService.test();
    }
}
