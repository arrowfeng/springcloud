package com.halo.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import com.halo.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: zdf
 * @Description:
 * @Date:Created in 01:20 2019/3/21
 **/
@Component
public class NacosProviderFallback implements NacosProviderFeignService {

	@Override
	public String echo(String message) {
		return "请求失败，请检查你的网络。";
	}
}
