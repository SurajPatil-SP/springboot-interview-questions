package com.demo.springbootinterviewquestions.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("threadScope")
public class Volunteer {
}
