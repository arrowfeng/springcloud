package com.halo.hello.spring.cloud.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zhangdunfeng
 * @description
 * @date 2019-03-27 19:54
 */
@Service(version = "${demo.service.version}")
public class DefaultService implements DemoService {

    @Value("${demo.service.name}")
    private String serviceName;

    public String sayName(String name) {
        RpcContext rpcContext = RpcContext.getContext();
        return String.format("Service [name :%s , port : %d] %s(\"%s\") : Hello,%s",
                serviceName,
                rpcContext.getLocalPort(),
                rpcContext.getMethodName(),
                name,
                name);
    }
}