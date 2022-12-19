package com.example.soccer.controller.mapper;

import com.example.soccer.controller.response.CreatePlayerResponse;
import com.example.soccer.controller.response.PlayerResponse;
import com.example.soccer.controller.response.UpdatePlayerResponse;
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
    public PlayerEntity toDomain(CreatePlayerResponse rest) {
        return PlayerEntity.builder()
                .name(rest.getName())
                .build();
    }
    public PlayerEntity toDomain(UpdatePlayerResponse rest){
        return  PlayerEntity.builder()
                .id(rest.getId())
                .name(rest.getName())
                .build();
    }
}
