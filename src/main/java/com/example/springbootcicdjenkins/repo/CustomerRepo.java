package com.example.springbootcicdjenkins.repo;

import com.example.springbootcicdjenkins.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
