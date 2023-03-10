package com.example.Projecto.repository;

import com.example.Projecto.entity.Tool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ToolRepository extends JpaRepository<Tool, Integer> {
    Tool findByName(String name);

}
