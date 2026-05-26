package org.ats.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "email_logs")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmailLog extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "recipent_email", columnDefinition = "VARCHAR(255)")
    private String recipentEmail;
    @Column(name = "status", columnDefinition = "VARCHAR(50)")
    private String status;
    @ManyToOne
    @JoinColumn(name = "email_template_id")
    private EmailTemplate emailTemplate;
}
