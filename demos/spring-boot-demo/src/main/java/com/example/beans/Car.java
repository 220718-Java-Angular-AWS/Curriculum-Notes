package com.example.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This car is parked in the garage: " + this.toString());
    }
}
