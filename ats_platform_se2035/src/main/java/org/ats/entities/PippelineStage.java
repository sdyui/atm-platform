package org.ats.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "pipeline_stages")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PippelineStage extends  BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "stage_name", columnDefinition = "VARCHAR(100)")
    private String stageName;
    @Column(name = "stage_order")
    private Integer stageOrder;
    @Column(columnDefinition = "VARCHAR(30)")
    private String stage;
    @Column(name = "is_default")
    private Boolean isDefault;
    @OneToMany(mappedBy = "pipeline_stages")
    private List<Application> applications;
}
