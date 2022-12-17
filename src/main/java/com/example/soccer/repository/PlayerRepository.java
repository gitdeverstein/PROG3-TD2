package com.example.soccer.repository;


import com.example.soccer.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {
    PlayerEntity findByIdAndName(int id, String name);
}