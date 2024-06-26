package com.example.demo.ChandraModel;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import lombok.Getter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChandraProduct {
    @Id
    private int id;
    private String name;
    private double price;
}