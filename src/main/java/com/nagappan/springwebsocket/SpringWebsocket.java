package com.nagappan.springwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.nagappan.springwebsocket"})
public class SpringWebsocket {

    @RequestMapping("/")
    public String home() {
        return "hello world";
    }

    public static void main(String args[]) {
        SpringApplication.run(SpringWebsocket.class, args);
    }
}
