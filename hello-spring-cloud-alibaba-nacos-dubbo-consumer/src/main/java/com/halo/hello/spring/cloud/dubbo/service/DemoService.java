package com.halo.hello.spring.cloud.dubbo.service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.stereotype.Service;

/**
 * @author zhangdunfeng
 * @description
 * @date 2019-03-28 16:04
 */

public interface DemoService {
    String sayName(String name);
}
