package com.mohan.ems_backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @Column(name = "name_first", nullable = false)
    private String firstName;

    @Column(name = "name_last", nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    private String city;

    @Column(name = "salary_in_inr")
    private BigDecimal salaryInInr;
}
