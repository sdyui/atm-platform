package org.ats.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "jobs")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Jobs extends BaseEntity{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
@Column(name = "recruiter_id")
    private Long recruiterId;
@Column(name = "title", columnDefinition = "NVARCHAR(500)")
    private String title;
@Column(name = "description")
    private String description;
@Column(name = "location",columnDefinition = "VARCHAR(500)")
    private String location;
@Column(name = "salary_min")
    private Double salaryMin;
@Column(name = "salary_max")
    private Double salaryMax;
@Column(name = "status", columnDefinition = "VARCHAR(50)")
    private String status;
@Column(name = "utm_source", columnDefinition = "VARCHAR(150)")
    private String utmSource;
@Column(name = "utm_medium", columnDefinition = "VARCHAR(50)")
    private String utmMedium;
@Column(name = "deadline")
    private LocalDateTime deadline;
@Column(name = "published_at")
    private LocalDateTime publishedAt;

}
