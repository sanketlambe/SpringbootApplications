package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "person")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passportId;
    @Column(unique = true)
    private String passportNumber;
    private LocalDate issueDate;
    private LocalDate expDate;
    @OneToOne
    @JoinColumn(name="person_id")
    private Person person;
}
