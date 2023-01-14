package com.example.soccer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Data
@Table(name="player")
@AllArgsConstructor
@NoArgsConstructor
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // int=> 32bites
    private String name;
    private int age;
    private int number;
    private boolean isGuardian;
    @ManyToOne
    @JoinColumn(name = "id_team")
    @JsonIgnore
    private TeamEntity team;
}
