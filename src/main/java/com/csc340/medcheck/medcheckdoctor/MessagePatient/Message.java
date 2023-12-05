/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.medcheck.medcheckdoctor.MessagePatient;
import jakarta.persistence.*;
import lombok.*;
/**
 *
 * @author Dev
 */
@AllArgsConstructor
@Entity
@Table(name = "message")
@Getter
@Setter
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String message;
    private String patientId;
    
    public Message(String message, String patientId) {
        this.message = message;
        this.patientId = patientId;
    }  
}
