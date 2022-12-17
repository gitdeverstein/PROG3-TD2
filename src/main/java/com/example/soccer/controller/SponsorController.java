package com.example.soccer.controller;

import com.example.soccer.controller.mapper.SponsorRestMapper;
import com.example.soccer.controller.response.SponsorResponse;
import com.example.soccer.service.SponsorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {
    private final SponsorService service;
    private final SponsorRestMapper mapper;
    private final SponsorResponse response;
    private List<SponsorResponse> SponsorEntity;

    @GetMapping("/sponsor")
    public List<SponsorResponse> getSponsor() {
        List<SponsorResponse> s = service.getSponsor().stream()
                .map(mapper::toRest)
                .toList();
        return SponsorEntity;
    }
}
