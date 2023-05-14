package com.spring.professional.exam.tutorial.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.spring.professional.exam.tutorial.module02.question07.ApplicationConfiguration.class);
        context.registerShutdownHook();

        com.spring.professional.exam.tutorial.module02.question07.beans.HelloChildBean springBean = context.getBean(com.spring.professional.exam.tutorial.module02.question07.beans.HelloChildBean.class);
        springBean.sayHello("John", 5);
        springBean.validateName("Jane");
        springBean.saveCounterValue(7);
        springBean.savePerson(new com.spring.professional.exam.tutorial.module02.question07.ds.Person());

        com.spring.professional.exam.tutorial.module02.question07.beans.ITaxBean taxBean1 = context.getBean(com.spring.professional.exam.tutorial.module02.question07.beans.ITaxBean.class);
        com.spring.professional.exam.tutorial.module02.question07.beans.TaxBean2 taxBean2 = context.getBean(com.spring.professional.exam.tutorial.module02.question07.beans.TaxBean2.class);
        taxBean1.calculateTax(5f);
        taxBean2.calculateTax(10f);

        com.spring.professional.exam.tutorial.module02.question07.beans.DepartmentRepository departmentRepository = context.getBean(com.spring.professional.exam.tutorial.module02.question07.beans.DepartmentRepository.class);
        com.spring.professional.exam.tutorial.module02.question07.ds.Department department = departmentRepository.findDepartment("DEPA%");
        departmentRepository.updateDepartment(5, department);

        com.spring.professional.exam.tutorial.module02.question07.beans.EmployeeBean employeeBean = context.getBean(com.spring.professional.exam.tutorial.module02.question07.beans.EmployeeBean.class);
        employeeBean.setId(5);
        employeeBean.setCubicId("A-105");
        employeeBean.setName("John");
        employeeBean.setWorkPhone("18885555");
        employeeBean.getId();
        employeeBean.getCubicId();
        employeeBean.getName();
        employeeBean.getWorkPhone();
    }
}
