package com.bnta.dealership_project.repositories;

import com.bnta.dealership_project.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
