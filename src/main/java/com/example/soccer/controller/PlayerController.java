package com.example.soccer.controller;


import com.example.soccer.controller.mapper.PlayerRestMapper;
import com.example.soccer.controller.response.PlayerResponse;
import com.example.soccer.model.PlayerEntity;
import com.example.soccer.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService service;
    private final PlayerRestMapper mapper;

    @GetMapping("/players")
    public List<PlayerResponse> getPlayers() {
        return service.getPlayers().stream()
                .map(mapper::toRest)
                .toList();
    }
    @PostMapping("/players")
    public List<PlayerResponse> createPlayers(@RequestBody List<PlayerResponse> toCreate) {
        List<PlayerEntity> domain = toCreate.stream()
                .map((PlayerResponse rest) -> mapper.toDomain(rest))
                .toList();
        return service.createPlayers(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/players")
    public List<PlayerResponse> updatePlayers(@RequestBody List<PlayerResponse> toUpdate) {
        List<PlayerEntity> domain = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.updatePlayers(domain).stream()
                .map(mapper::toRest)
                .toList();
    }
}
