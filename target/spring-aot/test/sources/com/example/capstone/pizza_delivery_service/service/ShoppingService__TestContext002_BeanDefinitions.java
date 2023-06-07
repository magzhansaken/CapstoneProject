package com.example.capstone.pizza_delivery_service.service;

import com.example.capstone.pizza_delivery_service.repositories.CustomersCredentialsRepository;
import com.example.capstone.pizza_delivery_service.repositories.CustomersRepository;
import com.example.capstone.pizza_delivery_service.repositories.DishesRepository;
import com.example.capstone.pizza_delivery_service.repositories.FoodTypesRepository;
import com.example.capstone.pizza_delivery_service.repositories.OrderCartRepository;
import com.example.capstone.pizza_delivery_service.repositories.OrderDetailsRepository;
import com.example.capstone.pizza_delivery_service.repositories.OrdersRepository;
import com.example.capstone.pizza_delivery_service.repositories.PaymentRepository;
import com.example.capstone.pizza_delivery_service.repositories.ToppingsRepository;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ShoppingService}.
 */
public class ShoppingService__TestContext002_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'shoppingService'.
   */
  private static BeanInstanceSupplier<ShoppingService> getShoppingServiceInstanceSupplier() {
    return BeanInstanceSupplier.<ShoppingService>forConstructor(CustomersCredentialsRepository.class, CustomersRepository.class, OrdersRepository.class, OrderDetailsRepository.class, OrderCartRepository.class, DishesRepository.class, ToppingsRepository.class, PaymentRepository.class, FoodTypesRepository.class, DatabaseService.class)
            .withGenerator((registeredBean, args) -> new ShoppingService(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5), args.get(6), args.get(7), args.get(8), args.get(9)));
  }

  /**
   * Get the bean definition for 'shoppingService'.
   */
  public static BeanDefinition getShoppingServiceBeanDefinition() {
    Class<?> beanType = ShoppingService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getShoppingServiceInstanceSupplier());
    return beanDefinition;
  }
}
