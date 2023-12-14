package com.demo.springbootinterviewquestions.dependencyambiguity;

import org.springframework.stereotype.Component;

@Component
public class AdminUserService implements UserService{
    @Override
    public void userLogin() {
        System.out.println("AdminUserService::userLogin() method executed...");
    }
}
