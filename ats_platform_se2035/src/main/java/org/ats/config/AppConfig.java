package org.ats.config;

import org.ats.dao.DepartmentDao;
import org.ats.dao.DepartmentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //metadata
public class AppConfig {
    @Bean
    public DepartmentDao departmentDao(){
        return new DepartmentDaoImpl();
    }
}
