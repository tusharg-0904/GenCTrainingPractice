package com.example.coffeeproject.pacag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CafeService {
    private CoffeeMachine coffeeMachine;

    @Autowired
    public CafeService(@Qualifier("espressoMachine") CoffeeMachine coffeemachine){
        this.coffeeMachine = coffeemachine;
    }

    public void StartCoffee(){
        this.coffeeMachine.makeCoffee();
    }
}