package com.example.soccer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "matchbetween")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class MatchEntity {
    @Id
    private long id_match;
    private LocalDate match_date;
    private String stadium;
    @OneToOne
    @JoinColumn(name = "id_team1")
    private TeamEntity team_1;
    @OneToOne
    @JoinColumn(name = "id_team2")
    private TeamEntity team_2;
}
