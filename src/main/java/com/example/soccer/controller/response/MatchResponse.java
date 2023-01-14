package com.example.soccer.controller.response;

import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MatchResponse {
    private long id;
    private LocalDate date;
    private TeamResponse teamOne;
    private TeamResponse team_two;
}
