package com.csc340.medcheck.pharmacist.prescriptions;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "prescriptions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Prescription {

    @Id
    @GeneratedValue
    private long prescriptionID;

    private long doctorID;
    private String doctorFullName;

    private long patientID;
    private String patientFullName;

    private String medicationName;
}
