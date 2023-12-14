package com.demo.springbootinterviewquestions.contoller;

import com.demo.springbootinterviewquestions.beanscope.RequestScopedBean;
import com.demo.springbootinterviewquestions.beanscope.SessionScopedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestControllerDemo {
    /*@Autowired
    private RequestScopedBean requestScopedBean;*/

    @Autowired
    private SessionScopedBean sessionScopedBean;

    @GetMapping("/message")
    public String getMessage() {
        return sessionScopedBean.getMessage();
    }
    @GetMapping("/restcontroller/welcome")
    public String welcome() {
        return "hello";
    }
}
