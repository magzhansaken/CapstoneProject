package com.example.capstone.pizza_delivery_service.controller;

import com.example.capstone.pizza_delivery_service.model.Customer;
import com.example.capstone.pizza_delivery_service.model.OrderCart;
import com.example.capstone.pizza_delivery_service.model.OrderDetails;
import com.example.capstone.pizza_delivery_service.service.AccountService;
import com.example.capstone.pizza_delivery_service.service.DatabaseService;
import java.lang.Class;
import org.springframework.aop.scope.ScopedProxyFactoryBean;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RegisteredBean;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AuthController}.
 */
public class AuthController__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'scopedTarget.authController'.
   */
  private static BeanInstanceSupplier<AuthController> getAuthControllerInstanceSupplier() {
    return BeanInstanceSupplier.<AuthController>forConstructor(AccountService.class, DatabaseService.class, Customer.class, OrderCart.class, OrderDetails.class)
            .withGenerator((registeredBean, args) -> new AuthController(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'authController'.
   */
  public static BeanDefinition getAuthControllerBeanDefinition() {
    Class<?> beanType = AuthController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setScope("session");
    beanDefinition.setAutowireCandidate(false);
    beanDefinition.setInstanceSupplier(getAuthControllerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Create the scoped proxy bean instance for 'authController'.
   */
  private static ScopedProxyFactoryBean getAuthControllerScopedProxyInstance(
      RegisteredBean registeredBean) {
    ScopedProxyFactoryBean factory = new ScopedProxyFactoryBean();
    factory.setTargetBeanName("scopedTarget.authController");
    factory.setBeanFactory(registeredBean.getBeanFactory());
    return factory;
  }

  /**
   * Get the bean definition for 'authController'.
   */
  public static BeanDefinition getAuthControllerBeanDefinition1() {
    Class<?> beanType = AuthController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(InstanceSupplier.of(AuthController__TestContext001_BeanDefinitions::getAuthControllerScopedProxyInstance));
    return beanDefinition;
  }
}
