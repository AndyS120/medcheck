package com.csc340.medcheck.pharmacist.prescriptions;

import com.csc340.medcheck.API.SearchField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/prescriptions")
@Controller
public class PrescriptionController {

    @Autowired
    PrescriptionService prescriptionService;

    @GetMapping({"/", ""})
    public String getPrescriptions(Model model) {
        SearchField searchField = new SearchField();
        model.addAttribute("searchField", searchField);
        model.addAttribute("prescriptionList", prescriptionService.getAllPrescriptions());
        return "portal-prescriptions";
    }


}
