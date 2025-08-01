package com.example.coffeeproject.pacag;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "com.example.coffeeproject.pacag")
public class CoffeeConfigur{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(CoffeeConfigur.class);
        CafeService cafeservice= context.getBean(CafeService.class);
        cafeservice.StartCoffee();

        context.close();
    }
}