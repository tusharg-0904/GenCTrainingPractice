package com.example.coffeeproject.pacag;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Qualifier("lattemachine")
@Scope("prototype")
public class LatteMachine implements CoffeeMachine {
    public LatteMachine() {
        System.out.println("Lattemachine instance created");
    }

    @Override
    public void makeCoffee() {
        System.out.println("It is a latte");
    }

}