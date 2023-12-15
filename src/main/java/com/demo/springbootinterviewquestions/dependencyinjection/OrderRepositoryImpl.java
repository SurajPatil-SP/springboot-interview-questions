package com.demo.springbootinterviewquestions.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class OrderRepositoryImpl implements OrderRepository{
    @Override
    public void saveOrder() {
        System.out.println("OrderRepositoryImpl::saveOrder() method executed..");
    }
}
