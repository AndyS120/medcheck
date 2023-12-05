package com.csc340.medcheck.security.doctor;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "doctor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Doctor {

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
    private String specialization;
    private String hospital;
    private int experience;

}
