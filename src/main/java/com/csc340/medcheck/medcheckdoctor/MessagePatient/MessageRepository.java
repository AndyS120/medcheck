/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.csc340.medcheck.medcheckdoctor.MessagePatient;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 * @author Dev
 */
public interface MessageRepository extends JpaRepository<Message, Long>{
    List<Message> findByPatientId(String fieldValue);
}
