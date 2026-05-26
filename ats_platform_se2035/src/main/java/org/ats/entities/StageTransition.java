package org.ats.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "stage_transitions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StageTransition extends  BaseEntity{
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
