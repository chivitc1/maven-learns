package com.example.app;
import com.example.core.models.Greeting;
import com.example.service.HelloService;

public class App {

    public static void main(String[] args) {
        Greeting greeting = new Greeting("Hello");
        HelloService service = new HelloService(greeting);
        String msg = service.sayHello("Chinv");
        System.out.println(msg);
    }

}