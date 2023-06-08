package com.example.capstone.food_delivery_service.repositories;

import com.example.capstone.food_delivery_service.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity,Integer> {
}
