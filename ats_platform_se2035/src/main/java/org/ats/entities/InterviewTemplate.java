package org.ats.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "interview_templates")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class InterviewTemplate extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="template_name",columnDefinition = "VARCHAR(255)")
    private String templateName;
    @Column(name = "file_path",columnDefinition = "VARCHAR(100)")
    private String filePath;
    @Column(name = "is_active")
    private Boolean isActive;

    @OneToMany(mappedBy = "interview")
    private List<Interview> interviews;
}
