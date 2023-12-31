package com.demo.springbootinterviewquestions.beanscope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
//    @Autowired
//    private ProtoTypeBean protoTypeBean;

//    @Autowired
//    ApplicationContext context;
    @Autowired
    private ObjectFactory<ProtoTypeBean> objectFactory;

    public SingletonBean() {
        System.out.println("SingletonBean() instantiated !!");
    }

    public ProtoTypeBean getProtoTypeBean() {
//        return protoTypeBean;
//        return context.getBean(ProtoTypeBean.class);
//        return objectFactory.getObject();
        return getInstance();
    }

    @Lookup
    public ProtoTypeBean getInstance(){
        return null;
    }

}
