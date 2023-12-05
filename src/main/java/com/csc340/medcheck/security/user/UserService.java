package com.csc340.medcheck.security.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

    @Autowired
    PasswordEncoder passwordEncoder;

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User getUser(long id) {
        return repo.getReferenceById(id);
    }

    public void deleteUser(long id) {
        repo.deleteById(id);
    }

    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repo.save(user);
    }

    public void updateUser(User user) {
        User existing = repo.getReferenceById(user.getId());
        if (user.getUserName() != null) {
            existing.setUserName(user.getUserName());
        }
        if (user.getPassword() != null) {
            existing.setPassword(passwordEncoder.encode(user.getPassword()));
        }
        if (user.getEmail() != null) {
            existing.setEmail(user.getEmail());
        }
        if (user.getRole() != null) {
            existing.setRole(user.getRole());
        }
        repo.save(existing);
    }

    public User getUserByUserName(String userName) {
        return repo.findByUserName(userName).orElseThrow(()
                -> new UsernameNotFoundException(userName + "not found"));
    }
}
