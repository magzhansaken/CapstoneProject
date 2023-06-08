package com.example.capstone.food_delivery_service.repositories;

import com.example.capstone.food_delivery_service.entity.OrderDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetailsEntity,Integer> {
}
