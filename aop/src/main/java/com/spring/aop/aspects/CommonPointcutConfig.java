package com.spring.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {
    @Pointcut("execution(* com.spring.aop.*.*.*(..))")
    public void businessAndDataPackageConfig() {}

    @Pointcut("execution(* com.spring.aop.business.*.*(..))")
    public void businessPackageConfig() {}

    @Pointcut("execution(* com.spring.aop.data.*.*(..))")
    public void dataPackageConfig() {}

    @Pointcut("bean(*Service*)")
    public void allPackageConfigUsingBean() {}

    @Pointcut("@annotation(com.spring.aop.annotations.TrackTime)")
    public void trackTimeAnnotation() {}
}
