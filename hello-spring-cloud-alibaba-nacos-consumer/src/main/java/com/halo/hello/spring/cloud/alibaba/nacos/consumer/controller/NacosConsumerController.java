package com.halo.hello.spring.cloud.alibaba.nacos.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zdf
 * @Description:
 * @Date:Created in 23:43 2019/3/20
 **/
@RestController
public class NacosConsumerController {

	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@Autowired
	private RestTemplate restTemplate;

	@Value("${spring.application.name}")
	private String appName;

	@GetMapping(value = "/echo/app/name")
	public String echo() {
		ServiceInstance instance = loadBalancerClient.choose("nacos-provider");
		String url = String.format("http://%s:%s/echo/%s", instance.getHost(), instance.getPort(), appName);
		return restTemplate.getForObject(url, String.class);
	}

}
