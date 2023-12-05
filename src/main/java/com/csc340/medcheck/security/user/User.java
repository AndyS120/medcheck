package com.csc340.medcheck.security.user;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @NonNull
    private String role;

    private String userName;
    private String email;
    private String password;

    public User(String userName, @NonNull String role, String email, String password) {
        this.userName = userName;
        this.role = role;
        this.email = email;
        this.password = password;
    }

}
