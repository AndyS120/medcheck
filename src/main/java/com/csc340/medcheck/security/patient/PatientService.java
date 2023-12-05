package com.csc340.medcheck.security.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientRepo repository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    public Patient getPatient(long id) {
        return repository.getReferenceById(id);
    }

    public void deletePatient(long id) {
        repository.deleteById(id);
    }

    public void savePatient(Patient patient2) {
        patient2.setPassword(passwordEncoder.encode(patient2.getPassword()));
        repository.save(patient2);
    }

    public Patient getPatientByUserName(String userName) {
        return repository.findByUserName(userName).orElseThrow(()
                -> new UsernameNotFoundException(userName + "not found"));
    }
}
