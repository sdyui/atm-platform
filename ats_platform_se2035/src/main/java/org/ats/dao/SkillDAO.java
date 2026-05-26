package org.ats.dao;

import org.ats.entities.Skill;

import java.util.List;

public interface SkillDAO {
    Skill createSkill(Skill skill);
    void deleteSkill(Long id);
    Skill updateSkill(Skill skill);
    List<Skill> findByName(String keyword);
}
