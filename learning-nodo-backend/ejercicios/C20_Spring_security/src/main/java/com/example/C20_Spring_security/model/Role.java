package com.example.C20_Spring_security.model;

import lombok.Data;
import jakarta.persistence.*;


@Entity
@Data
public class Role {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
