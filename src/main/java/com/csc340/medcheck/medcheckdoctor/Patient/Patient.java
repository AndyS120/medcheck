/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.medcheck.medcheckdoctor.Patient;

import jakarta.persistence.*;
import lombok.*;

/**
 *
 * @author Dev
 */
@AllArgsConstructor
@Entity
@Table(name = "patient")
@Getter
@Setter
@NoArgsConstructor
public class Patient {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String first;
    private String last;
    
    public Patient(String first, String last) {
        this.first = first;
        this.last = last;
    }    
}
