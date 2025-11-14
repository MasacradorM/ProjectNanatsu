package com.sena.crudBasic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;    

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;  

@Entity(name="characterMagicalsPewers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterMagicalsPewers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CharacterMagicalsPewersId")
    private int characterMagicalsPewersId;
    
    @ManyToOne
    @JoinColumn(name="charactersId")
    private Characters characters;
    
    @ManyToOne
    @JoinColumn(name="magicalPowersId")
    private MagicalPowers magicalPowers;
    
}
