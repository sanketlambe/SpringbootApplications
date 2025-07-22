package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;
    private String section;
    private String className;






}
