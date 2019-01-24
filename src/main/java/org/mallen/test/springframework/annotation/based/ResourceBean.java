package org.mallen.test.springframework.annotation.based;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * Created by mallen on 1/8/17.
 */
public class ResourceBean {
    @Resource
    @Qualifier(value = "max")
    private QualifierBean maxQualifierBean;

    @Resource
    @Qualifier(value = "min")// 使用Resource注解同样支持Q
    private QualifierBean minQualifierBean;

    public QualifierBean getMaxQualifierBean() {
        return maxQualifierBean;
    }

    public QualifierBean getMinQualifierBean() {
        return minQualifierBean;
    }
}
