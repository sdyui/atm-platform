package org.ats.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "cvs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Cvs extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "file_path", columnDefinition = "VARCHAR(1000)")
    private String filePath;
    @Column(name = "file_type", columnDefinition = "VARCHAR(50)")
    private String fileType;
    @Column(name = "parsed_data")
    private String parsedData;
    @Column(name = "parsed_status", columnDefinition = "VARCHAR(50)")
    private String parsedStatus;

    @ManyToOne
    @JoinColumn(name ="candidate_id")
    private Candidate candidate;

    @OneToMany(mappedBy = "cv")
    private List<Application> applications;
}
