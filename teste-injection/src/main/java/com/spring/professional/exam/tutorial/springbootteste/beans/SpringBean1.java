package com.spring.professional.exam.tutorial.springbootteste.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean1 {
    private SpringBean2 springBean2;
    private SpringBean3 springBean3;


    public SpringBean1() {
        System.out.println(getClass().getSimpleName() + "::constructor");
    }

    @Autowired
    public void setSpringBean2(SpringBean2 springBean2) {
        System.out.println(getClass().getSimpleName() + "::setSpringBean2");
        this.springBean2 = springBean2;
    }

    @Autowired
    public void setSpringBean3(SpringBean3 springBean3) {
        System.out.println(getClass().getSimpleName() + "::setSpringBean3");
        this.springBean3 = springBean3;
    }

    @Autowired public void setFoo1 (Foo foo1) {

    }
   @Autowired @Qualifier("foo3") Foo foo;
   @Autowired public void setFoo2(@Qualifier("foo2") Foo foo45) {}
   //@Autowired private Foo foo;
   @Autowired private Foo foo2;
   @Autowired public void setFoo3(Foo foo2) {}

    @PostConstruct
    public void init() {
        System.out.println(getClass().getSimpleName() + "::init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(getClass().getSimpleName() + "::destroy");
    }
}
