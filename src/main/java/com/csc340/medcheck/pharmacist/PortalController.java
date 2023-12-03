package com.csc340.medcheck.pharmacist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortalController {
    @GetMapping("/portal")
    public String getPortal() {
        return "portal-main";
    }

    @GetMapping("/main")
    public String goPortal() {
        return "redirect:/portal";
    }

    @GetMapping("/conflicts")
    public String getConflicts() {
        return "portal-conflicts";
    }
    @GetMapping("/prescriptions")
    public String getPrescriptions() {
        return "portal-prescriptions";
    }
}