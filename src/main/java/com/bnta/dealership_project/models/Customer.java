package com.bnta.dealership_project.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

// below are the properties for customer

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;


    @OneToMany(mappedBy = "customer")
    @JsonIgnoreProperties({"customer"})
    private List<Car> cars;



    public Customer(String name) {
        this.name = name;
        this.cars = new ArrayList<Car>();
    }

// below is the empty constructor


    public Customer() {
    }

// Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
