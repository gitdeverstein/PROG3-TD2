package com.example.soccer.controller.response;

import com.example.soccer.model.PlayerEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class CreatePlayerResponse {
    private int id;
    private String name;
    private int age;
    private List<PlayerEntity> players;
}
