package com.csc340.medcheck.security.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService service;

    @PostMapping("/create")
    public String createUser(Doctor doctor) {
        doctor.setRole("DOCTOR");
        doctor.setUserName(doctor.getEmail());
        service.saveDoctor(doctor);
        return "redirect:../medcheck/portal-messages";
    }
}
