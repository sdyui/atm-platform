package org.ats.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.ats.entities.Department;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {
    private EntityManager entityManager;

    public DepartmentDaoImpl() {
        entityManager = Persistence.createEntityManagerFactory("ats-jpa-unit").createEntityManager();
    }

    /**
     *
     * @param dept
     * @return In JPA/Hibernate: change data (Insert, delete, update) -> transaction (tự quản lý)
     */
    @Override
    public Department createDepartment(Department dept) {
        EntityTransaction tx = null;
        try {
            tx = entityManager.getTransaction();
            tx.begin();

            entityManager.persist(dept);

            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            throw new RuntimeException("has an error");
        }
        return dept;
    }

    @Override
    public boolean isExised(String name) {
        try (Session session = entityManager.unwrap(Session.class)){
            Query<Long> query = session.createQuery("SELECT COUNT (d) From Department d where d.departmentName = :name");
            query.setParameter("param",name);
            Long amout = query.getSingleResult();

            return  amout > 0;
        }

    }

    @Override
    public List<Department> findAll() {
        TypedQuery<Department> query = entityManager.createQuery("SELECT d " +
                "FROM Department d", Department.class);
        return query.getResultList();
    }
}
