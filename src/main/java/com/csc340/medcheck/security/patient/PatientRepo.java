package com.csc340.medcheck.security.patient;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepo extends JpaRepository<Patient2, Long> {

    Optional<Patient2> findByUserName(String userName);
}
