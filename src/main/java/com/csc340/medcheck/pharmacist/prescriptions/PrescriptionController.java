package com.csc340.medcheck.pharmacist.prescriptions;

import com.csc340.medcheck.API.SearchField;
import com.csc340.medcheck.security.doctor.DoctorService;
import com.csc340.medcheck.security.patient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/prescriptions")
@Controller
public class PrescriptionController {

    @Autowired
    PrescriptionService prescriptionService;
    @Autowired
    PatientService patientService;
    @Autowired
    DoctorService doctorService;

    @GetMapping({"/", ""})
    public String getPrescriptions(Model model) {
        SearchField searchField = new SearchField();
        model.addAttribute("searchField", searchField);
        model.addAttribute("prescriptionList", prescriptionService.getAllPrescriptions());
        model.addAttribute("patientList", patientService.getAllPatients());
        return "/pharmacist/portal-prescriptions";
    }


}
