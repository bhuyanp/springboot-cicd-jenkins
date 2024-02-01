package com.example.springbootcicdjenkins.service;

import com.example.springbootcicdjenkins.CICDApplicationTests;
import com.example.springbootcicdjenkins.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

@Slf4j
class CustomerServiceTest extends CICDApplicationTests {

    @Autowired
    CustomerService customerService;

    @Test
    @Transactional
    public void shouldAddCustomer() {
        //given
        Customer newCustomer = Customer.builder()
                .name("Prasanta Bhuyan")
                .email("prasanta.k.bhuyan@gmail.com")
                .build();

        //when
        Integer id = customerService.addCustomer(newCustomer);
        log.info("Customer id:{}", id);

        //then
        assertThat(id).isGreaterThan(-1);
        Customer customer = customerService.getCustomer(id);
        assertThat(customer).isNotNull();
        assertThat(customer.getName()).isEqualTo(newCustomer.getName());
    }

    @Test
    public void shouldNotGetCustomer() {
        //then
        assertThatThrownBy(() -> {
            customerService.getCustomer(-2);
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("No customer found");
    }


}