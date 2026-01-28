package com.telusko.JobApp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

//    return type, class-name.method-name, (args)
    @Before("execution(* com.telusko.JobApp.service.JobService.getAllJobs(..)) || execution(* com.telusko.JobApp.service.JobService.getJob(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method called " + jp.getSignature().getName());
    }

    @After("execution(* com.telusko.JobApp.service.JobService.getAllJobs(..))")
    public void logMethodExecuted(JoinPoint jp) {
        LOGGER.info("Method executed " + jp.getSignature().getName());
    }
    @AfterThrowing("execution(* com.telusko.JobApp.service.JobService.getJob(..))")
    public void logMethodCrash(JoinPoint jp) {
        LOGGER.info("Method crash " + jp.getSignature().getName());
    }
    @AfterReturning("execution(* com.telusko.JobApp.service.JobService.getJob(..))")
    public void logMethodSuccess(JoinPoint jp) {
        LOGGER.info("Method success " + jp.getSignature().getName());
    }
}
