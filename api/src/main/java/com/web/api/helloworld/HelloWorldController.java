package com.web.api.helloworld;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {

    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }


    @GetMapping(path = "/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping(path = "/hello-bean")
    public HelloBean helloBean() {
        return new HelloBean("hello bean");
    }

    @GetMapping(path = "/hello/path-variable/{name}")
    public HelloBean helloPathVariable(@PathVariable String name) {
        return new HelloBean(String.format("hello, %s", name));
    }

    @GetMapping(path = "/hello-i18n")
    public String helloWorldInternationalized() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default Message", locale);

    }
}
