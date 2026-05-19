package org.ats.dao;

import org.ats.entities.Department;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentDaoImplTest {

    private  static  DepartmentDao departmentDao;
    @BeforeAll
    static void setUpBeforeClass() throws Exception{
        departmentDao = new DepartmentDaoImpl();
    }

    @Test
    void createDepartment() {
        Department dept = new Department();
        dept.setDepartmentName("IT");
        dept.setDescription("Admin IT");

        Department actualResult = departmentDao.createDepartment(dept);
        String expectResult ="IT";
        Assertions.assertEquals(expectResult, actualResult.getDepartmentName());
    }
    @Test
    void createDepartment2(){
        Department dept = new Department();
        dept.setDepartmentName("HR");
        dept.setDescription("Human Resource");
        Department actualResult = departmentDao.createDepartment(dept);
        String expectResult ="IT";
        Assertions.assertEquals(expectResult, actualResult.getDepartmentName());
    }

    @Test
    void createDepartment3(){
        Department dept = new Department();

        Department actualResult = departmentDao.createDepartment(dept);

        Assertions.assertThrows(Exception.class,() ->{
            throw new Exception("Test execption");
        });
    }
    @Test
    void findAll() {
      List<Department> departments = departmentDao.findAll();
        Collections.sort(departments,(o1,o2)->{
            return  o1.getDepartmentName().compareTo(o2.getDepartmentName());
        });
    }
}