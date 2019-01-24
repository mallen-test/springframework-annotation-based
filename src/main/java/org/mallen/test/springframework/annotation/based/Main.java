package org.mallen.test.springframework.annotation.based;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mallen on 1/4/17.
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        ExampleBean exampleBean = applicationContext.getBean(ExampleBean.class);

        exampleBean.pringAnotherExampleBean();

        applicationContext.registerShutdownHook();
    }

}
