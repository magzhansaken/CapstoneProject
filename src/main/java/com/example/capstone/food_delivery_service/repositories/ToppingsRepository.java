package com.example.capstone.food_delivery_service.repositories;

import com.example.capstone.food_delivery_service.entity.ToppingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingsRepository extends JpaRepository<ToppingsEntity,Integer> {

    ToppingsEntity findByName(String name);

}
