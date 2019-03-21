package com.halo.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.halo.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zdf
 * @Description:
 * @Date:Created in 00:10 2019/3/21
 **/
@RestController
public class NacosProviderController {

	@Autowired
	private NacosProviderFeignService nacosProviderFeignService;

	@GetMapping(value = "/echo")
	public String echo(){
		return nacosProviderFeignService.echo("Hello Feign");
	}
}
