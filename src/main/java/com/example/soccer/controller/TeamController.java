package com.example.soccer.controller;

import com.example.soccer.controller.mapper.TeamRestMapper;
import com.example.soccer.controller.response.TeamResponse;
import com.example.soccer.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;
    private final TeamRestMapper mapper;

    @GetMapping("/teams")
    public List<TeamResponse> getTeams() {
        return service.getTeams().stream()
                .map(mapper::toRest)
                .toList();
    }
}
