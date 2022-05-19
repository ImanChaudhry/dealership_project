package com.bnta.dealership_project.repositories;

import com.bnta.dealership_project.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {


    List<Car> findCarByType(String type);
}
