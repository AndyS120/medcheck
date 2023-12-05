package com.csc340.medcheck.security.patient;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "patient")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Patient2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @NonNull
    private String role;

    private String userName;
    private String email;
    private String password;

    private String fullName;
    private LocalDate dob;
    private String gender;
    private String address;
    private String phoneNumber;
    private String insuranceInfo;
    private String allergies;
    private String medicalHistory;

}
