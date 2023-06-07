package com.example.capstone.pizza_delivery_service.controller;

import com.example.capstone.pizza_delivery_service.model.OrderCart;
import com.example.capstone.pizza_delivery_service.model.OrderDetails;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MyErrorController}.
 */
public class MyErrorController__TestContext002_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'myErrorController'.
   */
  private static BeanInstanceSupplier<MyErrorController> getMyErrorControllerInstanceSupplier() {
    return BeanInstanceSupplier.<MyErrorController>forConstructor(OrderCart.class, OrderDetails.class)
            .withGenerator((registeredBean, args) -> new MyErrorController(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'myErrorController'.
   */
  public static BeanDefinition getMyErrorControllerBeanDefinition() {
    Class<?> beanType = MyErrorController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getMyErrorControllerInstanceSupplier());
    return beanDefinition;
  }
}
