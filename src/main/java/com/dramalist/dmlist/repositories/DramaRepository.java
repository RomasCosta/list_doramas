/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dramalist.dmlist.repositories;

import com.dramalist.dmlist.entities.Drama;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author romar
 */
public interface DramaRepository extends JpaRepository<Drama, Long> {
    
}
