package com.advikaavyan.examples.mongodb;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "emps")
@Data
@Builder
public class Emp {
    @Id

    private Long id;
    private String name;
    private String doj;
    private String mobile;
}