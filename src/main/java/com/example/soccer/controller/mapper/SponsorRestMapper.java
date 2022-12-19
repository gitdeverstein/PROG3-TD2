package com.example.soccer.controller.mapper;
import com.example.soccer.controller.response.SponsorResponse;
import com.example.soccer.model.SponsorEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SponsorRestMapper {

    public SponsorResponse toRest(SponsorEntity domain) {
        return SponsorResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }
}
