package com.example.soccer.controller.mapper;

import com.example.soccer.controller.response.PlayerResponse;
import com.example.soccer.controller.response.TeamResponse;
import com.example.soccer.model.TeamEntity;
import com.example.soccer.repository.PlayerRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamRestMapper {
    private PlayerRepository repository;
    private PlayerRestMapper playerRestMapper;
    public TeamResponse toRest(TeamEntity domain) {
        List<PlayerResponse> playerList= repository.findAllByTeamId(domain.getId()).stream()
                .map(playerRestMapper::toRest).toList();
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

}
