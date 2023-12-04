package com.csc340.medcheck.pharmacist;

import com.csc340.medcheck.API.SearchField;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortalController {
    @GetMapping("/portal")
    public String getPortal(Model model) {
        SearchField searchField = new SearchField();
        model.addAttribute("searchField", searchField);
        return "redirect:/inventory/";
    }

    @GetMapping("/main")
    public String goToPortal() {
        return "redirect:/portal";
    }

}