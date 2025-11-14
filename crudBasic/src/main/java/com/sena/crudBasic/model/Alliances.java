package com.sena.crudBasic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name="alliances")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alliances {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="AlliancesId")
    private int alliancesId;
    
    @Column(name="alliancesName")
    private String alliancesName;

    @Column(name="alliancesDescription")
    private String alliancesDescription;
    
}
