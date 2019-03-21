package com.halo.hello.spring.cloud.alibaba.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: zdf
 * @Description: load balancer 方案
 * @Date:Created in 23:31 2019/3/20
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(NacosConsumerApplication.class, args);
	}
}
