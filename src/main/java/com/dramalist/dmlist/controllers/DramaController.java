/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dramalist.dmlist.controllers;

import com.dramalist.dmlist.dto.DramaDTO;
import com.dramalist.dmlist.dto.DramaMinDTO;
import com.dramalist.dmlist.services.DramaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author romar
 */
@RestController
@RequestMapping(value = "/dramas")
public class DramaController {
    
    @Autowired
    private DramaService service;
    
    @GetMapping(value = "/{id}")
    public DramaDTO findById(@PathVariable Long id) {
        DramaDTO result = service.findById(id);
        return result;
    }
    
    @GetMapping
    public List<DramaMinDTO> findAll() {
        List<DramaMinDTO> result = service.findAll();
        return result;
    }
   
}
