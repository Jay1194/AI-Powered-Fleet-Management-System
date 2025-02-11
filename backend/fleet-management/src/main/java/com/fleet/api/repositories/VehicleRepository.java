package com.fleet.api.repositories;

import com.fleet.api.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
