package com.example.soccer.repository;

import com.example.soccer.model.SponsorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SponsorRepository extends JpaRepository<SponsorEntity, Integer> {
    SponsorEntity findAll(int id, String name);
}
