package com.example.springbootcicdjenkins.service;

import com.example.springbootcicdjenkins.model.Customer;
import com.example.springbootcicdjenkins.repo.CustomerRepo;
import lombok.AllArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepo customerRepo;

    public Integer addCustomer(@NonNull Customer customer){

        Customer newCustomer = customerRepo.save(customer);
        return customer.getId();
    }

    public Customer getCustomer(@NonNull Integer id){
        return customerRepo
                .findById(id)
                .orElseThrow(()-> new IllegalArgumentException("No customer found"));
    }
}
