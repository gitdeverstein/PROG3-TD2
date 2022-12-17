package com.example.soccer.service;

import com.example.soccer.controller.response.PlayerResponse;
import com.example.soccer.model.PlayerEntity;
import com.example.soccer.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService{
    private final PlayerRepository repository;

    public List<PlayerEntity> getPlayers() {
        return repository.findAll();
    }

    public List<PlayerEntity> createPlayers(List<PlayerEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<PlayerEntity> updatePlayers(List<PlayerEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }
}
