package com.example.capstone.pizza_delivery_service.model;

import java.lang.Class;
import org.springframework.aop.scope.ScopedProxyFactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RegisteredBean;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link Customer}.
 */
public class Customer__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'customer'.
   */
  public static BeanDefinition getCustomerBeanDefinition() {
    Class<?> beanType = Customer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setScope("session");
    beanDefinition.setAutowireCandidate(false);
    beanDefinition.setInstanceSupplier(Customer::new);
    return beanDefinition;
  }

  /**
   * Create the scoped proxy bean instance for 'customer'.
   */
  private static ScopedProxyFactoryBean getCustomerScopedProxyInstance(
      RegisteredBean registeredBean) {
    ScopedProxyFactoryBean factory = new ScopedProxyFactoryBean();
    factory.setTargetBeanName("scopedTarget.customer");
    factory.setBeanFactory(registeredBean.getBeanFactory());
    return factory;
  }

  /**
   * Get the bean definition for 'customer'.
   */
  public static BeanDefinition getCustomerBeanDefinition1() {
    Class<?> beanType = Customer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(InstanceSupplier.of(Customer__TestContext001_BeanDefinitions::getCustomerScopedProxyInstance));
    return beanDefinition;
  }
}
