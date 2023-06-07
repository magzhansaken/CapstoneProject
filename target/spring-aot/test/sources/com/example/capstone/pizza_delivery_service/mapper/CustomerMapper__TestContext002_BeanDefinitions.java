package com.example.capstone.pizza_delivery_service.mapper;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CustomerMapper}.
 */
public class CustomerMapper__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'customerMapper'.
   */
  public static BeanDefinition getCustomerMapperBeanDefinition() {
    Class<?> beanType = CustomerMapper.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(CustomerMapper::new);
    return beanDefinition;
  }
}
