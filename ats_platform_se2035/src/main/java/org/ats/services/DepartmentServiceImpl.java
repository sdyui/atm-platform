package org.ats.services;

import org.ats.dao.DepartmentDao;
import org.ats.dao.DepartmentDaoImpl;
import org.ats.dto.DepartmentDto;
import org.ats.entities.Department;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DepartmentServiceImpl implements DepartmentService{
    private DepartmentDao departmentDao;
    private void setDepartmentDao(DepartmentDao departmentDao){
        this.departmentDao = departmentDao;
    }

    @Override
    public List<Department> findAll() {
        return departmentDao.findAll();
    }

    @Override
    public Department createDepartment(DepartmentDto dept) {
        if((dept.getDepartmentName() == null) || (dept.getDepartmentName().isEmpty())){
            throw new RuntimeException("department can't be emty");

        }
        return departmentDao.createDepartment(dept);
    }

    @Override
    public boolean isExised(String name) {
        return false;
    }
}
