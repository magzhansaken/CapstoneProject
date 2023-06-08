package com.example.capstone.food_delivery_service.service;

import com.example.capstone.food_delivery_service.controller.Controller;
import com.example.capstone.food_delivery_service.entity.CustomersCredentialsEntity;
import com.example.capstone.food_delivery_service.entity.FoodTypesEntity;
import com.example.capstone.food_delivery_service.entity.OrdersEntity;
import com.example.capstone.food_delivery_service.mapper.CustomerMapper;
import com.example.capstone.food_delivery_service.mapper.FoodTypesMapper;
import com.example.capstone.food_delivery_service.model.Customer;
import com.example.capstone.food_delivery_service.model.FoodTypes;
import com.example.capstone.food_delivery_service.model.Toppings;
import com.example.capstone.food_delivery_service.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Optional;

@Service
public class DatabaseService {
    Logger logger = LoggerFactory.getLogger(Controller.class);


    private final CustomersRepository customersRepository;
    private final CustomersCredentialsRepository customersCredentialsRepository;
    private final OrdersRepository ordersRepository;
    private final ToppingsRepository toppingsRepository;
    private final FoodTypesRepository foodTypesRepository;
    private final FoodTypesMapper foodTypesMapper;
    private final CustomerMapper customerMapper;

    @Autowired
    public DatabaseService(CustomersRepository customersRepository
            , CustomersCredentialsRepository customersCredentialsRepository
            , OrdersRepository ordersRepository
            , ToppingsRepository toppingsRepository
            , FoodTypesRepository foodTypesRepository
            , FoodTypesMapper foodTypesMapper
            , CustomerMapper customerMapper) {
        this.customersRepository = customersRepository;
        this.customersCredentialsRepository = customersCredentialsRepository;
        this.ordersRepository = ordersRepository;
        this.toppingsRepository = toppingsRepository;
        this.foodTypesRepository = foodTypesRepository;
        this.foodTypesMapper = foodTypesMapper;
        this.customerMapper = customerMapper;
        loadImages();
    }

    public List<Customer> getAllCustomers() {

        return customersRepository.findAll().stream().map(customerMapper::mapCustomerEntityToModel).toList();
    }

    public List<Toppings> getAllToppings() {
        return toppingsRepository.findAll().stream().map(x -> new Toppings(x.getName(), x.getPrice())).toList();
    }

    public List<FoodTypes> getAllFoodTypes() {
        return foodTypesRepository.findAll().stream().map(foodTypesMapper::mapFoodTypesEntityToModel).toList();
    }

    public Customer findCustomerById(Integer id) {
        return customerMapper.mapCustomerEntityToModel(customersRepository.findById(id).get());
    }

    public List<OrdersEntity> getAllOrders() {
        return ordersRepository.findAll();
    }

    public Boolean checkNewCustomerUsername(String username) {
        return customersCredentialsRepository.findByUsername(username).isPresent();
    }

    public Optional<CustomersCredentialsEntity> findByUsername(String username) {
        return customersCredentialsRepository.findByUsername(username);
    }

    public List<OrdersEntity> findOrdersByUsername(String username) {
        return ordersRepository.findAllBycustomerid(customersCredentialsRepository.findByUsername(username).get().getCustomerid());
    }

    public void loadImages() {
        List<FoodTypesEntity> foodTypesList = foodTypesRepository.findAll();
        int id;
        try {

            for (var foodtype : foodTypesList
            ) {
                byte[] b = foodtype.getImage();
                id = foodtype.getId();
                String fileName = "src/main/resources/static/images/" + id + ".jpg";
                FileOutputStream fos = new FileOutputStream(new File(fileName));
                fos.write(b);
                fos.close();
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
        logger.info("*** Images updated ***");
    }


}
