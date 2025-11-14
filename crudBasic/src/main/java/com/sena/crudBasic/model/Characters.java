package com.sena.crudBasic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name="characters")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Characters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CharactersId")
    private int charactersId;
    
    @Column(name="charactersName")
    private String charactersName;

    @Column(name="charactersDescription")
    private String charactersDescription;

    @Column(name="magic")
    private int magic;

    @Column(name="strength")
    private int strength;

    @Column(name="spirit")
    private int spirit;

    @ManyToOne
    @JoinColumn(name="roleId")
    private Role role;
    
    @ManyToOne
    @JoinColumn(name="orderId")
    private Order order;

    @ManyToOne
    @JoinColumn(name="weaponsId")
    private Weapons weapons;
    
}