package com.sena.crudBasic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name="breeds")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Breeds {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BreedsId")
    private int breedsId;
    
    @Column(name="breedsName")
    private String breedsName;
    
}
