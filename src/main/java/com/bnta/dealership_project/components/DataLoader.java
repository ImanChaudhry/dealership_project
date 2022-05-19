package com.bnta.dealership_project.components;

import com.bnta.dealership_project.models.Car;
import com.bnta.dealership_project.models.Customer;
import com.bnta.dealership_project.repositories.CarRepository;
import com.bnta.dealership_project.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    CarRepository carRepository;

    @Autowired
    CustomerRepository customerRepository;

// below is the run method

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Customer customer1 = new Customer("Brian");
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Joe");
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Gemma");
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Eve");
        customerRepository.save(customer4);

        Customer customer5 = new Customer("Jane");
        customerRepository.save(customer5);

        Car car1 = new Car("Speedo", "sporty", "customer3");
        carRepository.save(car1);

        Car car2 = new Car("Wagon", "family", "customer1");
        carRepository.save(car2);

        Car car3 = new Car("Inferno", "sporty", "customer2");
        carRepository.save(car3);

        Car car4 = new Car("Superb", "family", "customer4");
        carRepository.save(car4);

        Car car5 = new Car("Superb", "family", "customer5");
        carRepository.save(car5);
    }
}
