package com.example.soccer.repository;


import com.example.soccer.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {

    List<PlayerEntity> findAllByTeamId(Integer id);
}