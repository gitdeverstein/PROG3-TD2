package com.example.soccer.controller.mapper;

import com.example.soccer.controller.response.MatchResponse;
import com.example.soccer.model.MatchEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class MatchMapper {
    private TeamRestMapper mapper;
    public MatchResponse toRest(MatchEntity refactor){
        return MatchResponse.builder()
                .id(refactor.getId_match())
                .date(refactor.getMatch_date())
                .teamOne(mapper.toRest(refactor.getTeam_1()))
                .team_two(mapper.toRest(refactor.getTeam_2()))
                .build();
    }
}
