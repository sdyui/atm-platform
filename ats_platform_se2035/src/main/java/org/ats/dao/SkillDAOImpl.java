package org.ats.dao;

import jakarta.persistence.EntityManager;

import jakarta.persistence.TypedQuery;
import org.ats.entities.Skill;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SkillDAOImpl implements  SkillDAO {
    private EntityManager entityManager;
    public SkillDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public Skill createSkill(Skill skill) {
        //try-with-sources

        // Closeable
        Transaction tx = null;
        try (Session session = entityManager.unwrap(Session.class);) {
            tx = session.beginTransaction();

            session.persist(skill);

            tx.commit();
            return skill;
        } finally {
            if (tx != null) {
                tx.rollback();
            }
        }
    }

    @Override
    public void deleteSkill(Long id) {
        Transaction tx = null;
        try (Session session = entityManager.unwrap(Session.class);) {
            tx = session.beginTransaction();
            Skill skill = (Skill) session.get(Skill.class, id);
            session.remove(skill);
            tx.commit();
        }finally {
            if (tx != null) {
                tx.rollback();
            }
        }

    }

    @Override
    public Skill updateSkill(Skill skill) {
        Transaction tx = null;
        try (Session session = entityManager.unwrap(Session.class);) {
            tx = session.beginTransaction();
            session.merge(skill);
            tx.commit();
            return skill;
        }finally {
            if (tx != null) {
                tx.rollback();
            }
        }
    }

    @Override
    public List<Skill> findByName(String keyword) {
        TypedQuery<Skill> query;
        try (Session session = entityManager.unwrap(Session.class);) {
            query = session.createQuery("findByName", Skill.class);
            query.setParameter("keyword", "%" + keyword + "%");
        }
        return query.getResultList();
    }
}
