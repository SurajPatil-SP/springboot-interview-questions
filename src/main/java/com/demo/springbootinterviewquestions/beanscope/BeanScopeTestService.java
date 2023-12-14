package com.demo.springbootinterviewquestions.beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanScopeTestService {
    public BeanScopeTestService() {
        System.out.println("BeanScopeTestService() instance created..");
    }
}
