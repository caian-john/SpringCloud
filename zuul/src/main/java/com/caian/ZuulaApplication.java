package com.caian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableAutoConfiguration
@EnableZuulProxy
public class ZuulaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulaApplication.class,args);
    }
}
