package com.demo.springbootinterviewquestions;

import com.demo.springbootinterviewquestions.beanscope.BeanScopeTestService;
import com.demo.springbootinterviewquestions.beanscope.CustomThreadScope;
import com.demo.springbootinterviewquestions.beanscope.SingletonBean;
import com.demo.springbootinterviewquestions.common.Volunteer;
import com.demo.springbootinterviewquestions.dependencyinjection.OrderService;
import org.springframework.beans.factory.config.Scope;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootInterviewQuestionsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootInterviewQuestionsApplication.class, args);
        OrderService service = context.getBean("orderService", OrderService.class);
//        service.test();

        SingletonBean sb1 = context.getBean(SingletonBean.class);
        SingletonBean sb2 = context.getBean(SingletonBean.class);
        System.out.println(sb1.getProtoTypeBean().hashCode()+" - "+sb2.getProtoTypeBean().hashCode());

		/*Scope scope = new CustomThreadScope();
        context.getBeanFactory().registerScope("threadScope", scope);

        Runnable childThread = () -> {
            Volunteer v1 = context.getBean(Volunteer.class);
            Volunteer v2 = context.getBean(Volunteer.class);
            System.out.println("Hashcode of two object created by child thread " + v1.hashCode() + " & " + v2.hashCode());
        };
        new Thread(childThread).start();

		//This code will be executed by main thread
        Volunteer v1 = context.getBean(Volunteer.class);
        Volunteer v2 = context.getBean(Volunteer.class);
        System.out.println("Hashcode of two object created by main thread " + v1.hashCode() + " & " + v2.hashCode());

		BeanScopeTestService service1=context.getBean(BeanScopeTestService.class);
        BeanScopeTestService service2=context.getBean(BeanScopeTestService.class);
        BeanScopeTestService service3=context.getBean(BeanScopeTestService.class);
*/
	}

}
