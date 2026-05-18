package org.ats;

import org.ats.dao.DepartmentDao;
import org.ats.dao.DepartmentDaoImpl;
import org.ats.dao.UsersDAO;
import org.ats.dao.UsersDAOImpl;
import org.ats.entities.Department;
import org.ats.entities.Users;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        department.setDepartmentName("SE");
        department.setDescription("Software Engineering");

        DepartmentDao departmentDao = new DepartmentDaoImpl();
        Department result = departmentDao.createDepartment(department);
        System.out.println(result);

        departmentDao.findAll().forEach(System.out::println);

        Users user = new Users();
        user.setFullName("HUYNQ");
        user.setPassword("HUYNQ");
        user.setEmail("HUYNQ@FPT");
        user.setRole("HUYNQ");
        user.setPhone("s98998s939");

        UsersDAO usersDAO = new UsersDAOImpl();
        Users gi = usersDAO.createUsers(user);
        System.out.println(gi);

        usersDAO.findAll().forEach(System.out::println);

    }
}