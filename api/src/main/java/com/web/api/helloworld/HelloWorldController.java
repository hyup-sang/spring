package com.web.api.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping(path = "/hello-bean")
    public HelloBean helloBean() {
        return new HelloBean("hello");
    }

    @GetMapping(path = "/hello/path-variable/{name}")
    public HelloBean helloPathVariable(@PathVariable String name) {
        return new HelloBean(String.format("hello, %s", name));
    }
}
