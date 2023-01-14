package com.example.soccer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@Table(name="team")
@AllArgsConstructor
@NoArgsConstructor
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "team")
    private List<PlayerEntity> member;
    @ManyToMany(mappedBy = "teamSponsored")
    private List<SponsorEntity> sponsor;
}
