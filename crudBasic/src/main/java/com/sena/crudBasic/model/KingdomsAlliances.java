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

@Entity(name="kingdomsAlliances")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KingdomsAlliances {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="KingdomsAlliancesId")
    private int kingdomsAlliancesId;
    
    @ManyToOne
    @JoinColumn(name="kingdomsId")
    private Kingdoms kingdoms;
    
    @ManyToOne
    @JoinColumn(name="alliancesId")
    private Alliances alliances;
    
}
