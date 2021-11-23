/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.grupo9.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author TANATOS
 */
@Entity
@Table(name="Admin")
@Data
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="IdUsuarioAdmon")
    private int id;
    @Column(length = 250, name="NombreUsuarioAdmin")
    private String name;    
    @Column(length = 45, name="Email")
    private String email;
    @Column(length = 45, name="Contrasena")
    private String password;
    
}
