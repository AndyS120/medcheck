package com.csc340.medcheck.security.pharmacist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pharmacist")
public class PharmacistController {

    @Autowired
    PharmacistService service;

    @PostMapping("/create")
    public String createUser(Pharmacist pharmacist) {
        pharmacist.setRole("PHARMACIST");
        pharmacist.setUserName(pharmacist.getEmail());
        service.savePharmacist(pharmacist);
        return "redirect:../login";
    }
}
