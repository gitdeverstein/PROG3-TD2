package com.example.soccer.controller.mapper;
import com.example.soccer.controller.response.CreateSponsorResponse;
import com.example.soccer.controller.response.SponsorResponse;
import com.example.soccer.controller.response.UpdateSponsorResponse;
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
    public SponsorEntity toDomain(CreateSponsorResponse rest){
        return SponsorEntity.builder()
                .name(rest.getName())
                .build();
    }
    public SponsorEntity toDomain(UpdateSponsorResponse rest){
        return  SponsorEntity.builder()
                .id(rest.getId())
                .name(rest.getName())
                .build();
    }
}
