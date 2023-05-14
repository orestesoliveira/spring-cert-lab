package com.spring.professional.exam.tutorial.module02.question07.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class DepartmentRepositoryAspect {


    @Pointcut("@within(com.spring.professional.exam.tutorial.module02.question07.annotation.MonitoredRepository)")
    public void pointCutTeste(){

    }

    @Pointcut("@target(com.spring.professional.exam.tutorial.module02.question07.annotation.MonitoredRepository)")
    public void pointCutTeste2(){

    }

    @Before("pointCutTeste()")
    public void annotationWithinExampleX() {
        System.out.println("Before - XXXXXXXXXXX");
    }

    @Before("pointCutTeste2()")
    public void annotationWithinExample2() {
        System.out.println("Before - 22222222222222");
    }


    @Before("@within(com.spring.professional.exam.tutorial.module02.question07.annotation.MonitoredRepository)")
    public void annotationWithinExample() {
        System.out.println("Before - annotationWithinExample");
    }

    @Before("@target(com.spring.professional.exam.tutorial.module02.question07.annotation.MonitoredRepository)")
    public void annotationTargetExample() {
        System.out.println("Before - annotationTargetExample");
    }
}
