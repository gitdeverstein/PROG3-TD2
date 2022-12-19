package com.example.soccer.controller;

import com.example.soccer.controller.mapper.SponsorRestMapper;
import com.example.soccer.controller.response.CreateSponsorResponse;
import com.example.soccer.controller.response.SponsorResponse;
import com.example.soccer.controller.response.UpdateSponsorResponse;
import com.example.soccer.model.PlayerEntity;
import com.example.soccer.model.SponsorEntity;
import com.example.soccer.service.SponsorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {
    private final SponsorService service;
    private final SponsorRestMapper mapper;
    private List<SponsorResponse> SponsorEntity;

    @GetMapping("/sponsor")
    public List<SponsorResponse> getSponsor() {
        List<SponsorResponse> s = service.getSponsor().stream()
                .map(mapper::toRest)
                .toList();
        return SponsorEntity;
    }
    @PutMapping("/sponsor")
    public List<SponsorResponse> updateSponsor(@RequestBody List<UpdateSponsorResponse> toUpdate){
        List<SponsorEntity> domain = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.updateSponsor(domain).stream()
                .map(mapper::toRest)
                .toList();
    }
    @PostMapping("/sponsor")
    public List<SponsorResponse> createSponsor(@RequestBody List<CreateSponsorResponse> toCreate){
        List<SponsorEntity> domain = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.createSponsor(domain).stream()
                .map(mapper::toRest)
                .toList();
    }
}
