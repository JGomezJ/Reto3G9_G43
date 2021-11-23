/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.grupo9.entidades;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "Reservation")
@Data
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    // String dateFormat = "yyyy-mm-dd";
    // DateFormat df = new SimpleDateFormat(dateFormat);
    // Date dateToUse = df.parse("01-01-1994");
    @Column(name= "IdReservacion")
    private int id;
    @Column(name= "IdCliente")
    private int idClient;
    @Column(name= "IdBiblioteca")
    private int idLibrary;
    @Column(name= "FechaInicio")
    private Date startDate;
    @Column(name= "FechaEntrega")
    private Date deliveryDate;
    private String status;
    @Column(name= "FechaCreacion")
    private Date creationDate;
    
}
