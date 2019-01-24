package org.mallen.test.springframework.annotation.based;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by mallen on 1/4/17.
 */
public class ExampleBean {
    @Autowired
    private AnotherExampleBean anotherExampleBean;
    @Resource
    private ResourceBean rs;

    public void pringAnotherExampleBean() {
        System.out.println("anotherExampleBean = " + anotherExampleBean);
        System.out.println("rs = " + rs);
        System.out.println("max = " + rs.getMaxQualifierBean().getName());
        System.out.println("min = " + rs.getMinQualifierBean().getName());
    }
}
