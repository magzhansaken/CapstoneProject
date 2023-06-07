package com.example.capstone.pizza_delivery_service.security;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link UserDetailsService}.
 */
public class UserDetailsService__TestContext002_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static UserDetailsService apply(RegisteredBean registeredBean,
      UserDetailsService instance) {
    AutowiredFieldValueResolver.forRequiredField("databaseService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
