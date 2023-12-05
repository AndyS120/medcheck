package com.csc340.medcheck.security.pharmacist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacistService {

    @Autowired
    PharmacistRepo repository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public List<Pharmacist> getAllPharmacists() {
        return repository.findAll();
    }

    public Pharmacist getPharmacist(long id) {
        return repository.getReferenceById(id);
    }

    public void deletePharmacist(long id) {
        repository.deleteById(id);
    }

    public void savePharmacist(Pharmacist pharmacist) {
        pharmacist.setPassword(passwordEncoder.encode(pharmacist.getPassword()));
        repository.save(pharmacist);
    }

    public Pharmacist getPharmacistByUserName(String userName) {
        return repository.findByUserName(userName).orElseThrow(()
                -> new UsernameNotFoundException(userName + "not found"));
    }
}
