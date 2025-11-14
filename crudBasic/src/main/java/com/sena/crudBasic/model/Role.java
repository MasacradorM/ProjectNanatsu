package com.sena.crudBasic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name="role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="RoleId")
    private int roleId;
    
    @Column(name="roleName")
    private String roleName;
    
    @Column(name="roleDescription")
    private String roleDescription;
}
