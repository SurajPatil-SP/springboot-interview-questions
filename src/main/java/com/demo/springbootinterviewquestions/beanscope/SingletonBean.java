package com.demo.springbootinterviewquestions.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
//    @Autowired
//    private ProtoTypeBean protoTypeBean;

    @Autowired
    ApplicationContext context;

    public SingletonBean() {
        System.out.println("SingletonBean() instantiated !!");
    }

    public ProtoTypeBean getProtoTypeBean() {
//        return protoTypeBean;
        return context.getBean(ProtoTypeBean.class);
    }

}
