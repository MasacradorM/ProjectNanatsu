package com.sena.crudBasic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name="magicalPowers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MagicalPowers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MagicalPowersId")
    private int magicalPowersId;
    
    @Column(name="magicalPowersName")
    private String magicalPowersName;

    @Column(name="magicalPowersDescription")
    private String magicalPowersDescription;
    
}
