package com.demo.springbootinterviewquestions.dependencyambiguity;

import org.springframework.stereotype.Component;

@Component
public class StaffUserService implements UserService{
    @Override
    public void userLogin() {
        System.out.println("StaffUserService::userLogin() method executed...");
    }
}
