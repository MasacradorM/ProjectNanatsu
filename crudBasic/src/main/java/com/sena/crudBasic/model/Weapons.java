package com.sena.crudBasic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name="weapons")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weapons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="WeaponsId")
    private int weaponsId;
    
    @Column(name="weaponsName")
    private String weaponsName;

    @Column(name="weaponsDescription")
    private String weaponsDescription;
    
}
