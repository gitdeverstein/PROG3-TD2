package com.example.soccer.service;

import com.example.soccer.model.SponsorEntity;
import com.example.soccer.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SponsorService {
    private final SponsorRepository repository;
    public List<SponsorEntity> getSponsor() {
        return repository.findAll();
    }
}
