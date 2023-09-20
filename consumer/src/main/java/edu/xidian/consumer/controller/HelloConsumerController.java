package edu.xidian.consumer.controller;

import edu.xidian.provider.impl.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConsumerController {
    @DubboReference
    private HelloService service;

    @GetMapping(path = "/hello/{name}")
    public String sayHello(@PathVariable String name){
        return service.sayHello(name);
       // return name;
    }
}
