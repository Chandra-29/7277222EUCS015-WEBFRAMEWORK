package com.example.cw2.ChandraAspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ChandraAspect {

    @Before("execution(* com.example.cw2.ChandraService.ChandraService.process(..)) && args(input)")
    public void beforeAdvice(String input) {
        System.out.println("Before advice - Input: " + input);
    }

    @AfterReturning(pointcut = "execution(* com.example.cw2.ChandraService.ChandraService.process(..))", returning = "result")
    public void afterReturningAdvice(Object result) {
        System.out.println("After returning advice - Result: " + result);
    }

    @Around("execution(* com.example.cw2.ChandraService.ChandraService.process(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around advice - Before");
        Object result = joinPoint.proceed();
        System.out.println("Around advice - After");
        return "Modified: " + result;
    }
}
