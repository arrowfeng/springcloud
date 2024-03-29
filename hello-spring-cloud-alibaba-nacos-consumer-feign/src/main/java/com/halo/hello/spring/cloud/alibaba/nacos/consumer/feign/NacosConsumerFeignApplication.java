package com.halo.hello.spring.cloud.alibaba.nacos.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: zdf
 * @Description:
 * @Date:Created in 00:03 2019/3/21
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosConsumerFeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(NacosConsumerFeignApplication.class, args);
	}
}
