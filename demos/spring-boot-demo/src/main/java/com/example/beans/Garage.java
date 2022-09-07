package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Garage {
    Car car1;
    Car car2;

    public Garage() {
    }

    public String printcars() {
        return car1 + ", and " + car2;
    }

    @Autowired
    public Garage(Car car1, Car car2) {
        this.car1 = car1;
        this.car2 = car2;
    }
}
