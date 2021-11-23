/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.grupo9.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author TANATOS
 */
@Entity
@Table(name = "Library")
@Data
public class Library implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "IdBiblioteca")
    private int id;
    @Column(length = 45, name= "ObjetivoUso")
    private String purposeOfUse;
    @Column(length = 45, name= "NombreBiblioteca")
    private String name;
    @Column(name= "Capacidad")
    private int capacity; 
    @Column(length = 250, name= "Descripcion")
    private String description;
    @Column(name= "IdCategoria")
    private int idCategory;
    
}
