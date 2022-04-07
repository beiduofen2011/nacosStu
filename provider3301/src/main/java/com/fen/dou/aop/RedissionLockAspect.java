package com.fen.dou.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RedissionLockAspect {

    @Pointcut("@annotation(com.fen.dou.aop.LockM)")
    public void redissionLockPointCut() {

    }

    @Before("redissionLockPointCut()")
    public void before(JoinPoint joinPoint) throws Exception {
        System.out.println("-------------before--------------");
    }
    @After("redissionLockPointCut()")
    public void after(JoinPoint joinPoint) throws Exception {
        System.out.println("-------------after--------------");
    }
}