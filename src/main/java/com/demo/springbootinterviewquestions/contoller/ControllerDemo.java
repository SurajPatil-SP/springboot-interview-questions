package com.demo.springbootinterviewquestions.contoller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerDemo {
    @GetMapping(value = "/controller/welcome", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String welcome() {
        return "hello";
    }
}
