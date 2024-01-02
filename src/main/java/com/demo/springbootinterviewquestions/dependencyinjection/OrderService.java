package com.demo.springbootinterviewquestions.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private RestClientService restClientService;

    @Autowired
    @Lazy
    public void setRestClientService(RestClientService restClientService) {
        this.restClientService = restClientService;
    }
//    @Autowired
//    public OrderService(RestClientService restClientService) {
//        this.restClientService = restClientService;
//    }

    //Field level DI
//    @Autowired
    private OrderRepository orderRepository;

    //Setter DI
//    @Autowired
//    public void setOrderRepository(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }

    //Constructor DI
//    @Autowired
//    public OrderService(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }

    public void test() {
        orderRepository.saveOrder();
    }
}
