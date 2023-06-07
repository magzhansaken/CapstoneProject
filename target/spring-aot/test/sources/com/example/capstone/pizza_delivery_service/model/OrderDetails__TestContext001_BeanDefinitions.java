package com.example.capstone.pizza_delivery_service.model;

import java.lang.Class;
import org.springframework.aop.scope.ScopedProxyFactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RegisteredBean;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link OrderDetails}.
 */
public class OrderDetails__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'orderDetails'.
   */
  public static BeanDefinition getOrderDetailsBeanDefinition() {
    Class<?> beanType = OrderDetails.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setScope("session");
    beanDefinition.setAutowireCandidate(false);
    beanDefinition.setInstanceSupplier(OrderDetails::new);
    return beanDefinition;
  }

  /**
   * Create the scoped proxy bean instance for 'orderDetails'.
   */
  private static ScopedProxyFactoryBean getOrderDetailsScopedProxyInstance(
      RegisteredBean registeredBean) {
    ScopedProxyFactoryBean factory = new ScopedProxyFactoryBean();
    factory.setTargetBeanName("scopedTarget.orderDetails");
    factory.setBeanFactory(registeredBean.getBeanFactory());
    return factory;
  }

  /**
   * Get the bean definition for 'orderDetails'.
   */
  public static BeanDefinition getOrderDetailsBeanDefinition1() {
    Class<?> beanType = OrderDetails.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(InstanceSupplier.of(OrderDetails__TestContext001_BeanDefinitions::getOrderDetailsScopedProxyInstance));
    return beanDefinition;
  }
}
