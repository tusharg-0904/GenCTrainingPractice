package com.example.demo.coffee_machine;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Qualifier("espressoMachine")
@Scope("singleton")

public class EspressoMachine implements CoffeeMachine{
    public EspressoMachine(){
        System.out.println("EspressoMachine instance created");
    }
   
@PostConstruct
public void init(){
    System.out.println("Bean initialized");
}

@Override
public void  makeCoffee(){
    System.out.println("it's espresso");
}

@PreDestroy
public void destroy(){
    System.out.println("Bean destroyed");
}

}
