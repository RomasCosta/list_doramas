/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dramalist.dmlist.services;

import com.dramalist.dmlist.dto.DramaMinDTO;
import com.dramalist.dmlist.entities.Drama;
import com.dramalist.dmlist.repositories.DramaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author romar
 */
@Service
public class DramaService {
    
    @Autowired
    private DramaRepository repository;
    
    public List<DramaMinDTO> findAll() {
        List<Drama> result = repository.findAll();
        List<DramaMinDTO> dto = result.stream().map(x -> new DramaMinDTO(x)).toList();
        //return result.stream().map(x -> new DramaMinDTO(x)).toList();
        return dto;
    }
}
