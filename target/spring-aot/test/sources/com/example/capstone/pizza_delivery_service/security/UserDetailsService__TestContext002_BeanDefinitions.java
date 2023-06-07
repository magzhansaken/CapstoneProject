package com.example.capstone.pizza_delivery_service.security;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link UserDetailsService}.
 */
public class UserDetailsService__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'userDetailsService'.
   */
  public static BeanDefinition getUserDetailsServiceBeanDefinition() {
    Class<?> beanType = UserDetailsService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<UserDetailsService> instanceSupplier = InstanceSupplier.using(UserDetailsService::new);
    instanceSupplier = instanceSupplier.andThen(UserDetailsService__TestContext002_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
