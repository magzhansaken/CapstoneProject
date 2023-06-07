package com.example.capstone.pizza_delivery_service.service;

import com.example.capstone.pizza_delivery_service.mapper.CustomerMapper;
import com.example.capstone.pizza_delivery_service.mapper.FoodTypesMapper;
import com.example.capstone.pizza_delivery_service.repositories.CustomersCredentialsRepository;
import com.example.capstone.pizza_delivery_service.repositories.CustomersRepository;
import com.example.capstone.pizza_delivery_service.repositories.FoodTypesRepository;
import com.example.capstone.pizza_delivery_service.repositories.OrdersRepository;
import com.example.capstone.pizza_delivery_service.repositories.ToppingsRepository;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DatabaseService}.
 */
public class DatabaseService__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'databaseService'.
   */
  private static BeanInstanceSupplier<DatabaseService> getDatabaseServiceInstanceSupplier() {
    return BeanInstanceSupplier.<DatabaseService>forConstructor(CustomersRepository.class, CustomersCredentialsRepository.class, OrdersRepository.class, ToppingsRepository.class, FoodTypesRepository.class, FoodTypesMapper.class, CustomerMapper.class)
            .withGenerator((registeredBean, args) -> new DatabaseService(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5), args.get(6)));
  }

  /**
   * Get the bean definition for 'databaseService'.
   */
  public static BeanDefinition getDatabaseServiceBeanDefinition() {
    Class<?> beanType = DatabaseService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getDatabaseServiceInstanceSupplier());
    return beanDefinition;
  }
}
