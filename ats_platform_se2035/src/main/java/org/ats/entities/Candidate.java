package org.ats.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidates")
public class Candidate extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name ="full_name", columnDefinition = "VARCHAR(255)")
    private String fullName;
    @Column(name = "email", columnDefinition = "VARCHAR(255)")
    private String email;
    @Column(name = "password_hash", columnDefinition = "VARCHAR(50)")
    private String passwordHash;
    @Column(name = "auth_provider", columnDefinition = "VARCHAR(50)")
    private String authProvider;
    @Column(name = "oauth_provider_id",columnDefinition = "VARCHAR(255)")
    private String oauthProviderId;
    @Column(name = "status", columnDefinition = "VARCHAR(50)")
    private String status;
    @Column(name = "phone", columnDefinition = "VARCHAR(30)")
    private String phone;
    @Column(name ="source", columnDefinition = "VARCHAR(150)")
    private String source;
    @Column(name ="utm_source", columnDefinition = "VARCHAR(150")
    private String utmSource;
    @Column(name = "utm_medium", columnDefinition = "VARCHAR(150)")
    private String utmMedium;
    @Column(name = "utm_campaign", columnDefinition = "VARCHAR(255)")
    private String utmCampaign;
    @Column(name = "is_duplicate")
    private Boolean isDuplicate;
    @OneToMany(mappedBy = "candidate")
    private List<CandidateSkill> candidateSkills;

    @OneToMany(mappedBy = "candidate")
    private List<Cvs> cvs;

    @OneToMany(mappedBy = "candidate")
    private List<Application>applications;
}
