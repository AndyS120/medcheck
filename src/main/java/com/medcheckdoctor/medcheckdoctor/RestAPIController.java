/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medcheckdoctor.medcheckdoctor;
import com.medcheckdoctor.medcheckdoctor.Patient.Patient;
import com.medcheckdoctor.medcheckdoctor.Patient.PatientService;
import com.medcheckdoctor.medcheckdoctor.MessagePatient.MessageRepository;
import com.medcheckdoctor.medcheckdoctor.MessagePatient.Message;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Dev
 */
@RestController
@RequestMapping("/api")
public class RestAPIController {
    
    @Autowired
    private PatientService patientService;
    
    @Autowired
    private MessageRepository messageRepo;
    
    @GetMapping("/patients")
    public List<Patient> getPatients() {
        return patientService.getAllPatients();
    }
    
    @GetMapping("/messages")
    public List<Message> getMessages(@RequestParam String patientId) {
        return messageRepo.findByPatientId(patientId);
    }
    
    @PostMapping("/messages")
    public Message createMessage(@RequestBody Message message) {
        return messageRepo.save(new Message(message.getMessage(), message.getPatientId()));
    }
}
