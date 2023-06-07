package com.example.capstone.pizza_delivery_service.mapper;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link FoodTypesMapper}.
 */
public class FoodTypesMapper__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'foodTypesMapper'.
   */
  public static BeanDefinition getFoodTypesMapperBeanDefinition() {
    Class<?> beanType = FoodTypesMapper.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(FoodTypesMapper::new);
    return beanDefinition;
  }
}
