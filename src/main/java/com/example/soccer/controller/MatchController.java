package com.example.soccer.controller;

import com.example.soccer.controller.mapper.MatchMapper;
import com.example.soccer.controller.response.MatchResponse;
import com.example.soccer.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MatchController {
    private MatchMapper mapper;
    private MatchService matchService;
    @GetMapping("/match")
    public List<MatchResponse> ok(){
        return matchService.getMach().stream().map(mapper::toRest).toList();
    }
}
