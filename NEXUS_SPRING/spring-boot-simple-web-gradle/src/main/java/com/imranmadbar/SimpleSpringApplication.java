package com.imranmadbar;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringApplication.class, args);
        System.out.println("SimpleSpringApplication Run Successfully Done !");
    }
}
