package com.example.cw1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.cw1.ChandraService.ChandraService;

@SpringBootApplication
public class Cw1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Cw1Application.class, args);
        ChandraService myService = context.getBean(ChandraService.class);
        myService.doSomething();
    }
}
