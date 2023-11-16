package com.devsuperior.dslistspring.controllers;

import com.devsuperior.dslistspring.dto.GameDTO;
import com.devsuperior.dslistspring.dto.GameListDTO;
import com.devsuperior.dslistspring.dto.GameMinDTO;
import com.devsuperior.dslistspring.services.GameListService;
import com.devsuperior.dslistspring.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }
}
