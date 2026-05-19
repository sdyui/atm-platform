package org.ats.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "notifications")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Notifications extends BaseEntity{
@Id
    @Column(name = "notification_id")
    private Long id;
    @Column(name = "type",columnDefinition = "VARCHAR(50)")
    private String type;
    @Column(name = "title", columnDefinition = "NVARCHAR(500)")
    private String title;
    @Column(name = "message", columnDefinition = "TEXT")
    private String message;
    @Column(name= "is_read")
    private Boolean isRead;
}
