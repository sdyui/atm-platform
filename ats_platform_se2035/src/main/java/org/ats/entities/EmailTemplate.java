package org.ats.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "email_templates")
@NoArgsConstructor
@AllArgsConstructor
public class EmailTemplate extends BaseEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(name = "template_name",columnDefinition = "VARCHAR(255)")
    private String templateName;
@Column(columnDefinition = "VARCHAR(50)")
    private String type;
@Column(columnDefinition = "VARCHAR(500)")
    private String subject;
@Column(name = "body_html")
    private String bodyHtml;
    private String placehoders;
    @Column(name = "is_active")
    private String isActive;

    @OneToMany(mappedBy = "emailTemplate")
    private List<EmailLog> emailLogs;
}
