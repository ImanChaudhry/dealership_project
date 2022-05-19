package com.bnta.dealership_project.models;


import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

// below, are the properties for the cars

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String type;

    @ManyToOne
    @JoinColumn(name = "vet_id", nullable = false)
    private String customer;


// next, create constructors


    public Car(String name, String type, String customer) {
        this.name = name;
        this.type = type;
        this.customer = customer;
    }

// don't forget to have an empty constructor!


    public Car() {
    }
// Next, we need our Getters and Setters


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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
