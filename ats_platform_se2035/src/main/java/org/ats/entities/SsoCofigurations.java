package org.ats.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sso_configurations")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SsoCofigurations extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "provider_type",columnDefinition = "NVARCHAR(50)")
    private String providerType;
    @Column(name = "idap_url", columnDefinition = "NVARCHAR(500)")
    private String idapUrl;
    @Column(name = "base_dn",columnDefinition = "NVARCHAR(500)")
    private String baseDn;
    @Column(name = "is_active")
    private Boolean isActive;

}
