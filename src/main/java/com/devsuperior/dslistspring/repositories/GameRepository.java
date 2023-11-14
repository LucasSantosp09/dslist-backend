package com.devsuperior.dslistspring.repositories;

import com.devsuperior.dslistspring.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long> {
}
