package com.example.service;

import com.example.core.models.Greeting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloServiceTest {
    Greeting greeting = new Greeting("Xin chao");

    HelloService helloService = new HelloService(greeting);
    @Test
    void shouldReturnHelloMessage() {

        assertEquals("Xin chao Chi", helloService.sayHello("Chi"));
    }
}