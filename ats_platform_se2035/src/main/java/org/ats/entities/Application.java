package org.ats.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name  = "applications")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Application extends  BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(50")
    private String stutus;
    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "job_id")
    private List<Jobs> job;
    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private List<Candidate> candidate;
    @ManyToOne
    @JoinColumn(name = "cv_id")
    private List<Cvs> cvs;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private List<Department> department;
    @OneToMany(mappedBy = "application")
    private List<EvalutionNote> evaluationNotes;

}
