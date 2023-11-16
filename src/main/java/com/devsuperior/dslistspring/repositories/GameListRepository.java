package com.devsuperior.dslistspring.repositories;

import com.devsuperior.dslistspring.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
