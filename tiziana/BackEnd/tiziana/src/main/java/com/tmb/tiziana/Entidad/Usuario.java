/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tmb.tiziana.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter //Nos ahorra poner los getter y settes
@Entity //Nos difine la clase siguiente como entidad para bd
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size (max=30, message="Deben ser menos de 30 caracteres")
    private String nombre;
    
    @NotNull
    @Size (max=50, message="Deben ser menos de 50 caracteres")
    private String apellido;
    
      
    @Size (max=80)
    private String foto;

    
}
