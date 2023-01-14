package com.example.soccer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Scorer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ScorerEntity {
    @Id
    private int id;
    private boolean isOG;
    private int scoringTime;
    @ManyToOne
    @JoinColumn(name = "id_player")
    private PlayerEntity player;
}
