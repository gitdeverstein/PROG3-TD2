package com.example.soccer.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PlayedTeamResponse {
    private  int idTeam;
    private String name;
    private int goals;
    private int scorers;
}
