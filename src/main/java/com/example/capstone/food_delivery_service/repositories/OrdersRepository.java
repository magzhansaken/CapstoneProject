package com.example.capstone.food_delivery_service.repositories;

import com.example.capstone.food_delivery_service.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<OrdersEntity,Integer> {

    List<OrdersEntity> findAllBycustomerid(Integer id);

   

}
