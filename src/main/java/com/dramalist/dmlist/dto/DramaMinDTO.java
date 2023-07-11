/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dramalist.dmlist.dto;

import com.dramalist.dmlist.entities.Drama;

/**
 *
 * @author romar
 */
public class DramaMinDTO {
    
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public DramaMinDTO() {
    }

    public DramaMinDTO(Drama entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
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
