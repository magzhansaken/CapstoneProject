package com.example.capstone.pizza_delivery_service.controller;

import com.example.capstone.pizza_delivery_service.model.Customer;
import com.example.capstone.pizza_delivery_service.model.OrderCart;
import com.example.capstone.pizza_delivery_service.model.OrderDetails;
import com.example.capstone.pizza_delivery_service.service.DatabaseService;
import com.example.capstone.pizza_delivery_service.service.ShoppingService;
import java.lang.Class;
import org.springframework.aop.scope.ScopedProxyFactoryBean;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RegisteredBean;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link Controller}.
 */
public class Controller__TestContext002_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'scopedTarget.controller'.
   */
  private static BeanInstanceSupplier<Controller> getControllerInstanceSupplier() {
    return BeanInstanceSupplier.<Controller>forConstructor(ShoppingService.class, DatabaseService.class, Customer.class, OrderCart.class, OrderDetails.class)
            .withGenerator((registeredBean, args) -> new Controller(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'controller'.
   */
  public static BeanDefinition getControllerBeanDefinition() {
    Class<?> beanType = Controller.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setScope("session");
    beanDefinition.setAutowireCandidate(false);
    beanDefinition.setInstanceSupplier(getControllerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Create the scoped proxy bean instance for 'controller'.
   */
  private static ScopedProxyFactoryBean getControllerScopedProxyInstance(
      RegisteredBean registeredBean) {
    ScopedProxyFactoryBean factory = new ScopedProxyFactoryBean();
    factory.setTargetBeanName("scopedTarget.controller");
    factory.setBeanFactory(registeredBean.getBeanFactory());
    return factory;
  }

  /**
   * Get the bean definition for 'controller'.
   */
  public static BeanDefinition getControllerBeanDefinition1() {
    Class<?> beanType = Controller.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(InstanceSupplier.of(Controller__TestContext002_BeanDefinitions::getControllerScopedProxyInstance));
    return beanDefinition;
  }
}
