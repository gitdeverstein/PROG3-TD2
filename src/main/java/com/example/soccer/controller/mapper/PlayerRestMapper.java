package com.example.soccer.controller.mapper;

import com.example.soccer.controller.response.PlayerResponse;
import com.example.soccer.model.PlayerEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayerRestMapper {
    public PlayerResponse toRest(PlayerEntity domain) {
        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }
    public PlayerEntity toDomain(PlayerResponse rest) {
        return PlayerEntity.builder()
                .name(rest.getName())
                .build();
    }
}
