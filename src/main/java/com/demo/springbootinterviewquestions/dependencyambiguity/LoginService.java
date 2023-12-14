package com.demo.springbootinterviewquestions.dependencyambiguity;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    //@Qualifier("staffUserService")
    @Resource(name = "adminUserService")
    private UserService userService;
}
