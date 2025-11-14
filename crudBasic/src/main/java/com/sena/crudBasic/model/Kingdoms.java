package com.sena.crudBasic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name="kingdoms")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kingdoms {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="KingdomsId")
    private int kingdomId;
    
    @Column(name="kingdomsName")
    private String kingdomName;
    
    
}
