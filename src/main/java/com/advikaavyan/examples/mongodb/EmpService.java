package com.advikaavyan.examples.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepository userRepository;

    public List<Emp> getAllUsers() {
        return userRepository.findAll();
    }

    public Emp getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public Emp createUser(Emp emp) {
        return userRepository.save(emp);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}