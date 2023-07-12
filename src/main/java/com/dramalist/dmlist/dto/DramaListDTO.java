/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dramalist.dmlist.dto;

import com.dramalist.dmlist.entities.DramaList;

/**
 *
 * @author romar
 */
public class DramaListDTO {
    
    private Long id;
    private String name;

    public DramaListDTO() {
    }

    public DramaListDTO(DramaList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
