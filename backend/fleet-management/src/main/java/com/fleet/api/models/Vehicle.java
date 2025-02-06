package com.fleet.api.models;

import jakarta.persistence.*;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String licensePlate;
    private String status;
    private String location;

    // ✅ Default Constructor (Required by JPA)
    public Vehicle() {}

    // ✅ Custom Constructor (Needed for your Controller)
    public Vehicle(String licensePlate, String status, String location) {
        this.licensePlate = licensePlate;
        this.status = status;
        this.location = location;
    }

    // ✅ Getters & Setters (Needed for Spring Boot to work properly)
    public String getLicensePlate() { return licensePlate; }
    public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
