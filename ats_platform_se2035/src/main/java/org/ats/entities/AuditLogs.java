package org.ats.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "audit_logs")
public class AuditLogs extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "entity_type", columnDefinition = "VARCHAR(150")
    private String entityType;
    @Column(name = "action", columnDefinition = "VARCHAR(50)")
    private String action;
    @Column(name = "ip_adress", columnDefinition = "VARCHAR(50)",unique = true,nullable = false)
    private String ipAdress;
    @Column(name = "changes",columnDefinition = "JSONB")
    private String changes;
}
