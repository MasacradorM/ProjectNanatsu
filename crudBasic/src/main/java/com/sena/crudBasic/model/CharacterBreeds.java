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

@Entity(name="characterBreeds")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterBreeds {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CharacterBreedsId")
    private int characterBreedsId;
    
    @ManyToOne
    @JoinColumn(name="charactersId")
    private Characters characters;
    
    @ManyToOne
    @JoinColumn(name="breedsId")
    private Breeds breeds;
    
}
