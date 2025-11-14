package com.sena.crudBasic.model;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;


@Entity(name="order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="OrderId")
    private int orderId;
    
    @Column(name="orderName")
    private String orderName;

    @ManyToOne
    @JoinColumn(name="kingdomsId")
    private Kingdoms kingdoms;
    
    
}
