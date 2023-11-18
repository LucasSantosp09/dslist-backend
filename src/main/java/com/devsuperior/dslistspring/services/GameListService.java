package com.devsuperior.dslistspring.services;

import com.devsuperior.dslistspring.dto.GameDTO;
import com.devsuperior.dslistspring.dto.GameListDTO;
import com.devsuperior.dslistspring.dto.GameMinDTO;
import com.devsuperior.dslistspring.entities.Game;
import com.devsuperior.dslistspring.entities.GameList;
import com.devsuperior.dslistspring.projections.GameMinProjection;
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

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
    @Transactional
    public void move (Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex  < destinationIndex ? sourceIndex : destinationIndex;

        int max = sourceIndex  < destinationIndex ? destinationIndex : sourceIndex;

        for(int i = min; i < max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(),i );
        }

    }

}
