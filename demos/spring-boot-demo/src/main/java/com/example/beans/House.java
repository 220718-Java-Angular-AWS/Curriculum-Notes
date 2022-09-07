package com.example.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class House implements InitializingBean {
    private Garage attachedTwoCarGarage;

    public House() {
    }

    public void test() {
        System.out.println("This house has a garage, " + attachedTwoCarGarage + ", which has two cars: " + attachedTwoCarGarage.printcars());
    }

    public Garage getAttachedTwoCarGarage() {
        return attachedTwoCarGarage;
    }

    @Autowired
    public void setAttachedTwoCarGarage(Garage attachedTwoCarGarage) {
        this.attachedTwoCarGarage = attachedTwoCarGarage;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.test();
    }
}
