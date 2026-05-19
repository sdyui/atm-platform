package org.ats.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Set;

@Entity
@Table(name = "jobs")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Jobs extends BaseEntity{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

@Column(name = "title", columnDefinition = "NVARCHAR(500)", unique = true)
    private String title;
@Column(name = "description", columnDefinition = "TEXT")
    private String description;
@Column(name = "location",columnDefinition = "VARCHAR(500)")
    private String location;
@Column(name = "salary_min", columnDefinition = "numeric(15,2)")
    private Double salaryMin;
@Column(name = "salary_max", columnDefinition = "numeric(15,2)")
    private Double salaryMax;
@Column(name = "status", columnDefinition = "VARCHAR(50)")
    private String status;
@Column(name = "utm_source", columnDefinition = "VARCHAR(150)")
    private String utmSource;
@Column(name = "utm_medium", columnDefinition = "VARCHAR(50)")
    private String utmMedium;
@Column(name = "deadline")
    private OffsetDateTime deadline;
@Column(name = "published_at")
    private OffsetDateTime publishedAt;
    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "dept_id")
    private Department department;

}
