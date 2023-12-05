package com.csc340.medcheck.patient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/medcheck-patient")
public class PatientViewController {
    @GetMapping({"", "/", "/view"})
    public String viewPatientDashboard() {
        return "/patient/view";
    }
}
