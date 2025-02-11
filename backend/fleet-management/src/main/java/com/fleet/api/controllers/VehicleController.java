package com.fleet.api.controllers;

import com.fleet.api.models.Vehicle;
import com.fleet.api.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;  // ✅ Connects to the database

    // ✅ Fetch all vehicles from AWS RDS
    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    // ✅ Save a new vehicle to AWS RDS
    @PostMapping
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}

