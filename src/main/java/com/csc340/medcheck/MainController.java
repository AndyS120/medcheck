package com.csc340.medcheck;

import com.csc340.medcheck.security.doctor.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String getHome() {
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login/login";
    }

    @GetMapping("/login-doctor")
    public String loginDoctor() {
        return "login/login-doctor";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup/signup";
    }

    @GetMapping("/signup-doctor")
    public String signupDoctor(Model model) {
        Doctor doctor = new Doctor();
        model.addAttribute("doctor", doctor);
        return "signup/signup-doctor";
    }

    @GetMapping("/signup-patient")
    public String signupPatient() {
        return "signup/signup-patient";
    }
}