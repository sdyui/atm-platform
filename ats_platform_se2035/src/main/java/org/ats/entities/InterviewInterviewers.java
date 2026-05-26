package org.ats.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "interview_interviewers")
public class InterviewInterviewers {
    @Id
    @Column(name = "interview_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Interview interview;
    @Id
    @Column(name ="user_id")
    @ManyToOne
    private Users user;
}
