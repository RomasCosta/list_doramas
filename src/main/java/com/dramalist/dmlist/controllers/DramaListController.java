/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dramalist.dmlist.controllers;

import com.dramalist.dmlist.dto.DramaListDTO;
import com.dramalist.dmlist.services.DramaListService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author romar
 */
@RestController
@RequestMapping(value = "/lists")
public class DramaListController {
    
    @Autowired
    private DramaListService service;
    
    @GetMapping
    public List<DramaListDTO> findAll() {
        List<DramaListDTO> result = service.findAll();
        return result;
    }
   
}
