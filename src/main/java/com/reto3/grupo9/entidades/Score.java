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
@Table(name="Score")
@Data
public class Score implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="IdClasificacionReserva")
    private int id;
    @Column(length = 5, name="Clasificacion")
    //@Size(min = 0, max = 5)
    private int classification;
    @Column(length = 250, name="Mensaje")
    private String message;
    @Column(name="IdReserva")
    private int idReservation; 
    
}
