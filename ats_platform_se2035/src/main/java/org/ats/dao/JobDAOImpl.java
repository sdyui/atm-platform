package org.ats.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.ats.entities.Jobs;

import java.util.List;

public class JobDAOImpl implements  JobDAO{
    private EntityManager entityManager;
    public JobDAOImpl(){
        entityManager = Persistence.createEntityManagerFactory("ats-jpa-unit").createEntityManager();
    }
    @Override
    public Jobs createJob(Jobs job) {
        EntityTransaction tx = null;
        try{
            tx = entityManager.getTransaction();
            tx.begin();

            entityManager.persist(job);
            tx.commit();
        }catch (Exception e){
            if(tx!= null){
                tx.rollback();
            }
            throw new RuntimeException("meo meo");
        }
        return job;
    }

    @Override
    public List<Jobs> findByTitle(String title) {
        TypedQuery<Jobs> query = entityManager.createQuery("SELECT j from  Jobs j  where j.title LIKE:parram", Jobs.class);
        query.setParameter("parram", "%" + title + "%");
        return query.getResultList();
    }
}
