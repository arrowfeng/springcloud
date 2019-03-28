package com.halo.hello.spring.cloud.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author zhangdunfeng
 * @description
 * @date 2019-03-27 22:22
 */
@EnableDubbo(scanBasePackages = "com.halo.hello.spring.cloud.dubbo.service")
@SpringBootApplication
public class DubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
