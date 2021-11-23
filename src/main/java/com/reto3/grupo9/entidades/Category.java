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
@Table(name="Category")
@Data
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdCategoria")
    private int id;
    @Column(length = 45, name = "NombreCategoria")
    private String name;
    @Column(length = 250, name = "DescripcionCategoria")
    private String description;
    
}
