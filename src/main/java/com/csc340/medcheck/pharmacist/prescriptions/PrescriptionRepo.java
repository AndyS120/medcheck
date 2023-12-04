package com.csc340.medcheck.pharmacist.prescriptions;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepo extends JpaRepository<Prescription, Long> {
}
