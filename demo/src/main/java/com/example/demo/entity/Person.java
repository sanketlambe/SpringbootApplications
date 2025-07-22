package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = "passport")
public class Person {

    String personName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personId;
    private String gender;
    @OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
    Passport passport;
}
