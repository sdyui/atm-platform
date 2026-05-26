package org.ats.controller;

import org.ats.dto.DepartmentDto;
import org.ats.services.DepartmentService;
import org.ats.services.DepartmentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DepartmentController {
    public static void main(String[] args) {
        DepartmentDto dto = new DepartmentDto();
        dto.setDepartmentName("department 1");
        dto.setDepartmentName("abc");
        ApplicationContext context = new AnnotationConfigApplicationContext("org.ats");
        DepartmentService departmentService =context.getBean(DepartmentServiceImpl.class);
    }
}
