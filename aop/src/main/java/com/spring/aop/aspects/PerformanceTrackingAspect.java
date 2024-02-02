package com.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class PerformanceTrackingAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Around("execution(* com.spring.aop.aspects.CommonPointcutConfig.businessAndDataPackageConfig())")
    public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTimeMillis = System.currentTimeMillis();
        long stopTimeMillis = System.currentTimeMillis();
        long executionDuration = stopTimeMillis - startTimeMillis;

        Object returnValue = proceedingJoinPoint.proceed();

        logger.info("Around Aspect - {} Method executed in {} ms"
                ,proceedingJoinPoint, executionDuration);

        return returnValue;
    }
}
