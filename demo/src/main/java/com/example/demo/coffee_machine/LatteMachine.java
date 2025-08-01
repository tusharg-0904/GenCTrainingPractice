package com.example.demo.coffee_machine;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lattemachine")
@Scope("prototype")
public class LatteMachine implements CoffeeMachine{
    public LatteMachine(){
        System.out.println("LatteMachine instance created");
    }

    @Override
    public void makeCoffee(){
        System.out.println("it's a latte");
    }   
}
