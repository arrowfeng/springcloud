package com.halo.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import com.halo.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback.NacosProviderFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: zdf
 * @Description:
 * @Date:Created in 00:07 2019/3/21
 **/

@FeignClient(value = "nacos-provider", fallback = NacosProviderFallback.class)
public interface NacosProviderFeignService {

	@GetMapping(value = "/echo/{message}")
	String echo(@PathVariable(value = "message") String message);
}
