package com.example.soccer.service;


import com.example.soccer.controller.response.CreateTeamResponse;
import com.example.soccer.controller.response.UpdateTeamResponse;
import com.example.soccer.model.TeamEntity;
import com.example.soccer.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService{
    private final TeamRepository repository;

    public List<TeamEntity> getTeams() {
        return repository.findAll();
    }

    public List<TeamEntity> createTeams(List<TeamEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<TeamEntity> updateTeams(List<TeamEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }
}
