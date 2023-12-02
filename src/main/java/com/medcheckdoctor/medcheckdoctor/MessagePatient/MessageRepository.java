/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.medcheckdoctor.medcheckdoctor.MessagePatient;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Dev
 */
public interface MessageRepository extends JpaRepository<Message, Long>{
    List<Message> findByPatientId(String fieldValue);
}
