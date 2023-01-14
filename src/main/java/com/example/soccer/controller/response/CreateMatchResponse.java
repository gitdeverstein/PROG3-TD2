package com.example.soccer.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@Builder
public class CreateMatchResponse {
    private long id;
    private LocalDate date;
}
