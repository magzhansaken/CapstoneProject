package com.example.capstone.pizza_delivery_service.service;

import com.example.capstone.pizza_delivery_service.repositories.CustomersRepository;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AccountService}.
 */
public class AccountService__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'accountService'.
   */
  private static BeanInstanceSupplier<AccountService> getAccountServiceInstanceSupplier() {
    return BeanInstanceSupplier.<AccountService>forConstructor(CustomersRepository.class)
            .withGenerator((registeredBean, args) -> new AccountService(args.get(0)));
  }

  /**
   * Get the bean definition for 'accountService'.
   */
  public static BeanDefinition getAccountServiceBeanDefinition() {
    Class<?> beanType = AccountService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getAccountServiceInstanceSupplier());
    return beanDefinition;
  }
}
