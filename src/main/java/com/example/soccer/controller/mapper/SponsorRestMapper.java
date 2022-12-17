package com.example.soccer.controller.mapper;

import com.example.soccer.controller.response.PlayerResponse;
import com.example.soccer.controller.response.SponsorResponse;
import com.example.soccer.model.PlayerEntity;
import com.example.soccer.model.SponsorEntity;
import com.example.soccer.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class SponsorRestMapper {
    private final SponsorRepository sponsorRepository;

    public SponsorResponse toRest(SponsorEntity domain) {
        return SponsorResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }
}
