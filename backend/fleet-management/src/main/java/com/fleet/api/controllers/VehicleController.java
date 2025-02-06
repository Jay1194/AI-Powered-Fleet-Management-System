package com.fleet.api.controllers;

import com.fleet.api.models.Vehicle;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // ✅ Tells Spring Boot this is a REST API Controller
@RequestMapping("/api/vehicles")  // ✅ Base URL for this API
public class VehicleController {

    // ✅ This method returns a list of example vehicles
    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return List.of(
            new Vehicle("ABC123", "active", "New York"),
            new Vehicle("XYZ789", "inactive", "Los Angeles")
        );
    }
}
