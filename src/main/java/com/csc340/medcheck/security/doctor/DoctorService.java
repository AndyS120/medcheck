package com.csc340.medcheck.security.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepo repository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public List<Doctor> getAllDoctors() {
        return repository.findAll();
    }

    public Doctor getDoctor(long id) {
        return repository.getReferenceById(id);
    }

    public void deleteDoctor(long id) {
        repository.deleteById(id);
    }

    public void saveDoctor(Doctor doctor) {
        doctor.setPassword(passwordEncoder.encode(doctor.getPassword()));
        repository.save(doctor);
    }

    public Doctor getDoctorByUserName(String userName) {
        return repository.findByUserName(userName).orElseThrow(()
                -> new UsernameNotFoundException(userName + "not found"));
    }
}
