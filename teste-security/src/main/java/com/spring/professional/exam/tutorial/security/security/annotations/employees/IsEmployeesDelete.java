package com.spring.professional.exam.tutorial.module06.question02.security.annotations.employees;

import org.springframework.security.access.annotation.Secured;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.spring.professional.exam.tutorial.module06.question02.security.SecurityRoles.EMPLOYEES_DELETE;
import static com.spring.professional.exam.tutorial.module06.question02.security.SecurityRoles.ROLE_PREFIX;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Secured(ROLE_PREFIX + EMPLOYEES_DELETE)
public @interface IsEmployeesDelete {
}
