package com.example.soccer.repository;

import com.example.soccer.model.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<MatchEntity,Long> {
    List<MatchEntity> findAll();
}
