/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.medcheck.medcheckdoctor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Dev
 */
@Controller
@RequestMapping("/medcheck")
public class DoctorUIController {
    
    @GetMapping("/portal-messages")
    public String loadPortalMessage(Model model) {
        return "doctor/portal-messages";
    }
}