package org.ats.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "candidate_skills")
public class CandidateSkill {
    @Id
    @Column(name = "skill_id")
    @ManyToOne
    private String skill;

    @Id
    @Column(name = "candidate_id")
    @ManyToOne
    private Candidate candidate;
}
