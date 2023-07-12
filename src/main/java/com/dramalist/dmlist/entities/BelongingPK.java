/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dramalist.dmlist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Objects;

/**
 *
 * @author romar
 */
@Embeddable
class BelongingPK {
    
    @ManyToOne
    @JoinColumn(name = "drama_id")
    private Drama drama;
    
    @ManyToOne
    @JoinColumn(name = "list_id")
    private DramaList dramaList;

    public BelongingPK() {
    }

    public BelongingPK(Drama drama, DramaList dramaList) {
        this.drama = drama;
        this.dramaList = dramaList;
    }

    public Drama getDrama() {
        return drama;
    }

    public void setDrama(Drama drama) {
        this.drama = drama;
    }

    public DramaList getDramaList() {
        return dramaList;
    }

    public void setDramaList(DramaList dramaList) {
        this.dramaList = dramaList;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.drama);
        hash = 17 * hash + Objects.hashCode(this.dramaList);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BelongingPK other = (BelongingPK) obj;
        if (!Objects.equals(this.drama, other.drama)) {
            return false;
        }
        return Objects.equals(this.dramaList, other.dramaList);
    }
}
