package com.csc340.medcheck.security;

import com.csc340.medcheck.security.doctor.DoctorRepo;
import com.csc340.medcheck.security.pharmacist.Pharmacist;
import com.csc340.medcheck.security.pharmacist.PharmacistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private DoctorRepo doctorRepo;
    @Autowired
    private PharmacistRepo pharmacistRepo;
//    @Autowired
//    private UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//        Doctor doctor = doctorRepo.findByUserName(username)..orElseThrow(()
//                -> new UsernameNotFoundException(username + "not found"));
        Pharmacist pharmacist = pharmacistRepo.findByUserName(username).orElseThrow(()
                -> new UsernameNotFoundException(username + "not found"));

        ArrayList<SimpleGrantedAuthority> authList = new ArrayList<>();

//        if (doctorRepo.findByUserName(username).isPresent()) {
//            authList.add(new SimpleGrantedAuthority(doctor.getRole()));
//            return new org.springframework.security.core.userdetails.User(
//                    doctor.getUserName(), doctor.getPassword(), authList);

        if (pharmacistRepo.findByUserName(username).isPresent()) {
//    } else if (pharmacistRepo.findByUserName(username).isPresent()) {
            authList.add(new SimpleGrantedAuthority(pharmacist.getRole()));
            return new org.springframework.security.core.userdetails.User(
                    pharmacist.getUserName(), pharmacist.getPassword(), authList);
        }

        return null;
    }

}
