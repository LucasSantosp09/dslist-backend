package com.devsuperior.dslistspring.dto;

import com.devsuperior.dslistspring.entities.Game;
import com.devsuperior.dslistspring.projections.GameMinProjection;
import jakarta.persistence.Column;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projecction) {
        id = projecction.getId();
        title = projecction.getTitle();
        year = projecction.getGameYear();
        imgUrl = projecction.getImgUrl();
        shortDescription = projecction.getShortDescription();
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
