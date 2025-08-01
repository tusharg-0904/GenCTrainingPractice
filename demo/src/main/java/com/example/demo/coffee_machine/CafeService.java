package com.example.demo.coffee_machine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CafeService {
    private CoffeeMachine coffeemachine;

    @Autowired
    public CafeService(@Qualifier("espressoMachine") CoffeeMachine coffeemachine){
        this.coffeemachine= coffeemachine;
    }
    
    public void StartCoffee(){
        this.coffeemachine.makeCoffee();
    }
    
}
