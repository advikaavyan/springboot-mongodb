package com.advikaavyan.examples.mongodb;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpRepository extends MongoRepository<Emp, String> {
    // Custom query methods can be defined here if needed
}