package org.ats.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.ats.entities.Users;

import java.util.List;

public class UsersDAOImpl implements UsersDAO {
    private EntityManager entityManager;

    public UsersDAOImpl() {
        entityManager = Persistence.createEntityManagerFactory("ats-jpa-unit").createEntityManager();
    }
    @Override
    public List<Users> findAll() {
        TypedQuery<Users> query = entityManager.createQuery("SELECT u FROM Users u", Users.class);
        return query.getResultList();
    }

    @Override
    public Users createUsers(Users users) {
        EntityTransaction tx = null;
        try {
            tx = entityManager.getTransaction();
             tx.begin();

             entityManager.persist(users);

             tx.commit();
        }catch (Exception e) {
            if(tx!=null)
            {
                tx.rollback();
            }
        }
        return users;
    }
}
