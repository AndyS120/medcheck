package com.csc340.medcheck.pharmacist.prescriptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionService {

    @Autowired
    PrescriptionRepo repository;

    public Prescription getPrescriptionById(long id) {
        return repository.getReferenceById(id);
    }

    public List<Prescription> getAllPrescriptions() {
        return repository.findAll();
    }

    public void savePrescription(Prescription prescription) {
        repository.save(prescription);
    }

    public void updatePrescription(long id, Prescription prescription) {
        Prescription existing = getPrescriptionById(id);
        existing.setPrescriptionID(prescription.getPrescriptionID());
        existing.setDoctorFullName(prescription.getDoctorFullName());
        existing.setDoctorID(prescription.getDoctorID());
//        existing.set

        repository.save(existing);
    }

    public void deletePrescriptionById(long id) {
        repository.deleteById(id);
    }
}
