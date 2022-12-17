package com.example.soccer.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class CreateTeamResponse {
    private int id;
    private String name;
}
