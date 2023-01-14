package com.example.soccer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@Table(name="sponsor")
@AllArgsConstructor
@NoArgsConstructor
public class SponsorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany
    @JoinTable(
            name = "haveSponsor",
            joinColumns = @JoinColumn(name = "id_sponsor"),
            inverseJoinColumns = @JoinColumn(name = "id_team")
    )
    @JsonIgnore
    private List<TeamEntity> teamSponsored;
}
