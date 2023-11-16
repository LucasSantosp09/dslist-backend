package com.devsuperior.dslistspring.services;

import com.devsuperior.dslistspring.dto.GameDTO;
import com.devsuperior.dslistspring.dto.GameListDTO;
import com.devsuperior.dslistspring.dto.GameMinDTO;
import com.devsuperior.dslistspring.entities.Game;
import com.devsuperior.dslistspring.entities.GameList;
import com.devsuperior.dslistspring.repositories.GameListRepository;
import com.devsuperior.dslistspring.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }



}
