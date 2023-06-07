package com.example.capstone.pizza_delivery_service;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link PizzaDeliveryServiceApplication}.
 */
public class PizzaDeliveryServiceApplication__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'pizzaDeliveryServiceApplication'.
   */
  public static BeanDefinition getPizzaDeliveryServiceApplicationBeanDefinition() {
    Class<?> beanType = PizzaDeliveryServiceApplication.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(PizzaDeliveryServiceApplication.class);
    beanDefinition.setInstanceSupplier(PizzaDeliveryServiceApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
