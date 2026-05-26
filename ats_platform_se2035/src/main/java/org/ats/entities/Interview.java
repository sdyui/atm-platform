package org.ats.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.Set;

@Entity
@Table(name = "interviews")
@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Interview extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="interview_type", columnDefinition = "VARCHAR(50")
    private String interviewType;
    @Column(name = "scheduled_at")
    private OffsetDateTime scheduledAt;
    @Column(name = "meeting_link", columnDefinition = "VARCHAR(100)")
    private String meetingLink;
    @Column(name = "status", columnDefinition = "VARCHAR(50)")
    private String status;
    @Column(name = "duration_minutes")
    private Integer durationMinutes;
    @Column(name = "feedback")
    private String feedback;
    @Column(name = "result", columnDefinition = "VARCHAR(50)")
    private String result;
    @Column(name = "interview_name", columnDefinition = "VARCHAR(255)")
    private String interviewName;
    @Column(name = "interview_email", columnDefinition = "VARCHAR(255)")
    private String interviewEmail;
    @Column(name = "notes_file_path", columnDefinition = "VARCHAR(1000)")
    private String notesFilePath;

    @OneToMany(mappedBy = "interview")
    private Set<InterviewInterviewers>interviewInterviewers;

    @ManyToOne
    @JoinColumn(name = "interview_templates_id")
    private InterviewTemplate interviewTemplate;
}
