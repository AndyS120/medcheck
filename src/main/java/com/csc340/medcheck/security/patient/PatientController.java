package com.csc340.medcheck.security.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService2 service;

    @PostMapping("/create")
    public String createUser(Patient2 patient2) {
        patient2.setRole("PATIENT");
        patient2.setUserName(patient2.getEmail());
        service.savePatient(patient2);
        return "redirect:../login";
    }
}
