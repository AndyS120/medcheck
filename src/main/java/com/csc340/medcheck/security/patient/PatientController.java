package com.csc340.medcheck.security.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService service;

    @PostMapping("/create")
    public String createUser(Patient patient) {
        patient.setRole("PATIENT");
        patient.setUserName(patient.getEmail());
        service.savePatient(patient);
        return "redirect:../login";
    }

}
