package org.ats.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Entity
@Getter @Setter
@ToString

public class Users extends  BaseEntity{
    @Id
    @Column(name = "users_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    @Column(name = "password_hash", nullable = false, columnDefinition = "VARCHAR(255)")
    private String password;

    @Column(name = "phone", columnDefinition = "VARCHAR(30)", nullable = false)
    private String phone;

    @Column(name = "role", columnDefinition = "VARCHAR(50)", nullable = false)
    private String role;

    @Column(name = "full_name", columnDefinition = "VARCHAR(255)", nullable = false)
    private String fullName;

    @OneToMany(mappedBy = "department")
    private List<Department> departments;

}
