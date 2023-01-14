package com.example.soccer.service;

import com.example.soccer.model.MatchEntity;
import com.example.soccer.repository.MatchRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Service
public class MatchService {
    private MatchRepository repository;
    public List<MatchEntity> getMach(){
        return repository.findAll();
    }
}
