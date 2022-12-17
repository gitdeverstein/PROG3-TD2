package com.example.soccer.repository;

import com.example.soccer.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamEntity, Integer> {
}
