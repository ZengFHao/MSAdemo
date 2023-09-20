package edu.xidian.provider.impl;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name){
        return "Hello, " + name + "(from Dubbo with Spring Boot)";
    }
}
