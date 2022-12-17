package com.example.soccer.controller.mapper;

import com.example.soccer.controller.response.TeamResponse;
import com.example.soccer.model.TeamEntity;
import org.springframework.stereotype.Component;

@Component
public class TeamRestMapper {
    public TeamResponse toRest(TeamEntity domain) {
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

}
