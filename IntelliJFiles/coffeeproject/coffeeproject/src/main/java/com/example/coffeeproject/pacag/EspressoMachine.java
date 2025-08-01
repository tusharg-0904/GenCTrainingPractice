package com.example.coffeeproject.pacag;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("espressomachine")
@Scope("singleton")
class EspressoMachine implements CoffeeMachine {
    public EspressoMachine() {
        System.out.println("EspressoMachine instance created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean initialized");
    }

    public void makeCoffee() {
        System.out.println("It is an espresso");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean destroyed");
    }

}