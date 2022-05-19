package com.bnta.dealership_project.controllers;


import com.bnta.dealership_project.models.Car;
import com.bnta.dealership_project.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("cars")
public class CarController {

    @Autowired
    CarRepository carRepository;

// INDEX

    @GetMapping
    public ResponseEntity<Car> getAllPetsAndFilters(
            @RequestParam(required = false, name = "type") String type
    ) {
        if (type != null) {
            return new ResponseEntity(carRepository.findAll(), HttpStatus.OK);
        }
        return null;
    }


// SHOW

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Car>> getCar (@PathVariable Long id){
        return new ResponseEntity(carRepository.findById(id),  HttpStatus.OK);
    }

// POST

    @PostMapping // localhost:8080/pets/
    public ResponseEntity<Car> createCar(@RequestBody Car newCar){
        carRepository.save(newCar);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }

// DELETE

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> deleteCar(@PathVariable Long id){
        var car = carRepository.findById(id);
        if (car.isEmpty()) {
            return new ResponseEntity<>(id, HttpStatus.NOT_FOUND);
        } else {
            carRepository.delete(car.get());
            return new ResponseEntity<>(id, HttpStatus.OK);
        }
    }





}
