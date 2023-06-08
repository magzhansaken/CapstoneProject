package com.example.capstone.food_delivery_service.repositories;

import com.example.capstone.food_delivery_service.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<CustomerEntity,Integer> {

}
