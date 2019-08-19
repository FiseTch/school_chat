package com.tong.school_chat.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.logging.Logger;

/**
 * @author tongch -Administrator
 * @version 1.0
 * @classname TestAspect
 * @date 2019/08/19 21:51
 * @description
 **/
@Aspect
@Component
@Slf4j
public class TestAspect {
    
    // 定义一个切面 execution(方法权限  返回值 包名方法名 任意参数任何名字的方法) --支持正则
    @Pointcut("execution(public * com.tong.school_chat.domain..*.*(..))")
    public void webPoint() {
    }
    
    @Before("webPoint()")
    public void doBefore(JoinPoint joinPoint) {
        //处理切面前的功能
        log.info("start: -> {}", "hello World");
    }
    
    @AfterReturning(returning = "ret", pointcut = "webPoint()")
    public void doAfterReturning(Object ret) {
        //ret 代表切面方法的返回值
        log.info("ret: -> {}", ret);
        log.info("end: -> {}", "over");
    }
}
