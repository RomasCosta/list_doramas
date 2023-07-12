/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dramalist.dmlist.services;

import com.dramalist.dmlist.dto.DramaListDTO;
import com.dramalist.dmlist.entities.DramaList;
import com.dramalist.dmlist.repositories.DramaListRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author romar
 */
@Service
public class DramaListService {
    
    @Autowired
    private DramaListRepository repository;
    
    @Transactional(readOnly = true)
    public List<DramaListDTO> findAll() {
        List<DramaList> result = repository.findAll();
        List<DramaListDTO> dto = result.stream().map(x -> new DramaListDTO(x)).toList();
        //return result.stream().map(x -> new DramaMinDTO(x)).toList();
        return dto;
    }
}
