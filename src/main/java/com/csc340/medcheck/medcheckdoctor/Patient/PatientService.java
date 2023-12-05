/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.medcheck.medcheckdoctor.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Dev
 */
@Service
public class PatientService {
    
    @Autowired
    private PatientRepository patientRepo;
    
    public List<Patient> getAllPatients() {
        return patientRepo.findAll();
    }
}
