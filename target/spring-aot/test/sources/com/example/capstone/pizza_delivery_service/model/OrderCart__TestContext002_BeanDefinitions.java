package com.example.capstone.pizza_delivery_service.model;

import java.lang.Class;
import org.springframework.aop.scope.ScopedProxyFactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RegisteredBean;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link OrderCart}.
 */
public class OrderCart__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'orderCart'.
   */
  public static BeanDefinition getOrderCartBeanDefinition() {
    Class<?> beanType = OrderCart.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setScope("session");
    beanDefinition.setAutowireCandidate(false);
    beanDefinition.setInstanceSupplier(OrderCart::new);
    return beanDefinition;
  }

  /**
   * Create the scoped proxy bean instance for 'orderCart'.
   */
  private static ScopedProxyFactoryBean getOrderCartScopedProxyInstance(
      RegisteredBean registeredBean) {
    ScopedProxyFactoryBean factory = new ScopedProxyFactoryBean();
    factory.setTargetBeanName("scopedTarget.orderCart");
    factory.setBeanFactory(registeredBean.getBeanFactory());
    return factory;
  }

  /**
   * Get the bean definition for 'orderCart'.
   */
  public static BeanDefinition getOrderCartBeanDefinition1() {
    Class<?> beanType = OrderCart.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(InstanceSupplier.of(OrderCart__TestContext002_BeanDefinitions::getOrderCartScopedProxyInstance));
    return beanDefinition;
  }
}
