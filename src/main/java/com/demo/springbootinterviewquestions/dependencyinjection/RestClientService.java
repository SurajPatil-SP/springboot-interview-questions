package com.demo.springbootinterviewquestions.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RestClientService {

    private OrderService orderService;

    @Autowired
    public RestClientService(OrderService orderService) {
        this.orderService = orderService;
    }
}
