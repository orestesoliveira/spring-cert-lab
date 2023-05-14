package com.spring.professional.exam.tutorial.springbootteste;

import com.spring.professional.exam.tutorial.springbootteste.beans.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ApplicationConfiguration {
    @Bean
    public static CustomBeanFactoryPostProcessor getCustomBeanFactoryPostProcessor() {
        return new CustomBeanFactoryPostProcessor();
    }

    @Bean
    public static CustomBeanPostProcessor getCustomerBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }

    @Bean
    public Foo foo1() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }

    @Bean
    public Foo foo3() {
        return new Foo();
    }
}
