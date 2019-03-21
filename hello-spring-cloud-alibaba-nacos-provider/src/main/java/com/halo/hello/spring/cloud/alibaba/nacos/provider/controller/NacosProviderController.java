package com.halo.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zdf
 * @Description:
 * @Date:Created in 22:07 2019/3/20
 **/
@RestController
public class NacosProviderController {

	@GetMapping(value = "/echo/{message}")
	public String echo(@PathVariable(value = "message") String message){
		return "Hello Nacos3 " + message;
	}
}
