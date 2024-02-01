package com.example.springbootcicdjenkins.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Builder
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    String email;
}
