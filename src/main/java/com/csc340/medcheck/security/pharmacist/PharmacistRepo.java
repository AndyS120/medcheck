package com.csc340.medcheck.security.pharmacist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PharmacistRepo extends JpaRepository<Pharmacist, Long> {

    Optional<Pharmacist> findByUserName(String userName);
}
