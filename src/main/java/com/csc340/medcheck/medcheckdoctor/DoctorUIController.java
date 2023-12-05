/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.medcheck.medcheckdoctor;

import com.csc340.medcheck.API.SearchField;
import com.csc340.medcheck.pharmacist.prescriptions.Prescription;
import com.csc340.medcheck.pharmacist.prescriptions.PrescriptionService;
import com.csc340.medcheck.security.doctor.DoctorService;
import com.csc340.medcheck.security.patient.PatientService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Dev
 */
@Controller
@RequestMapping("/medcheck")
public class DoctorUIController {

    @Autowired
    PatientService patientService;
    @Autowired
    DoctorService doctorService;
    @Autowired
    PrescriptionService prescriptionService;

    @GetMapping("/portal-messages")
    public String loadPortalMessage(Model model) {
        return "doctor/portal-messages";
    }


    @GetMapping("/doctor-patient-info")
    public String loadPatientInfo(Model model) {
        return "doctor/patient-info";
    }
//    @GetMapping("/portal-patient-info")
//    public String loadPatientInfo(Model model) {
//        model.addAttribute("patientList", patientService.getAllPatients());
//        return "doctor/portal-patient-info";
//    }

    @GetMapping("/portal-prescribe")
    public String loadMedications(Model model) {
        Prescription prescription = new Prescription();
        model.addAttribute("prescription", prescription);
        model.addAttribute("patientList", patientService.getAllPatients());
        return "doctor/portal-prescribe";
    }

    @PostMapping("/create-prescription")
    public String updatePrescription(Prescription prescription) {
        prescription.setDoctorFullName("Joe Swanson");
        prescription.setPatientFullName(patientService.getPatient(prescription.getPatientID()).getFullName());
        prescriptionService.savePrescription(prescription);
        return "redirect:/portal-prescribe";
    }

    @GetMapping("/search")
    public String getAPI(Model model, SearchField searchField) {
        String term = searchField.getTerm();
        try {
            String url = String.format("https://api.fda.gov/drug/label.json?search=openfda.generic_name:%s", term);
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper mapper = new ObjectMapper();

            String jSonQuote = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(jSonQuote);
            JsonNode response = root.get("results").get(0);

            model.addAttribute("response", response);
            model.addAttribute("openFDA", response.get("openfda"));

        } catch (RestClientException | JsonProcessingException ignored) {
        }
        return "doctor/portal-search";
    }
}
