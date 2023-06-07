package com.example.capstone.pizza_delivery_service.mapper;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ToppingsMapper}.
 */
public class ToppingsMapper__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'toppingsMapper'.
   */
  public static BeanDefinition getToppingsMapperBeanDefinition() {
    Class<?> beanType = ToppingsMapper.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ToppingsMapper::new);
    return beanDefinition;
  }
}
