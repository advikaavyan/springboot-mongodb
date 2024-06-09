package com.advikaavyan.examples.mongodb;

// UserController.java

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emps")
@Slf4j
public class EmpController {
    @Autowired
    private EmpService userService;

    @GetMapping
    public List<Emp> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Emp getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public Emp createUser(@RequestBody Emp emp) {
        log.info("Emp going to be created...{}", emp.toString());
        return userService.createUser(emp);
    }


    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }
}