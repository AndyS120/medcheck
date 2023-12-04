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

    @Column(nullable = false)
    private long doctorID;
    private String doctorFirstName;
    private String doctorLastName;

    @Column(nullable = false)
    private long patientID;
    private String patientFirstName;
    private String patientLastName;

    @Column(nullable = false)
    private long medicationID;
}
