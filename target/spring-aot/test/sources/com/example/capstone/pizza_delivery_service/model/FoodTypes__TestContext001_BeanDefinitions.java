package com.example.capstone.pizza_delivery_service.model;

import java.lang.Class;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import org.springframework.aop.scope.ScopedProxyFactoryBean;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RegisteredBean;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link FoodTypes}.
 */
public class FoodTypes__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'scopedTarget.foodTypes'.
   */
  private static BeanInstanceSupplier<FoodTypes> getFoodTypesInstanceSupplier() {
    return BeanInstanceSupplier.<FoodTypes>forConstructor(Integer.class, String.class, BigDecimal.class, String.class)
            .withGenerator((registeredBean, args) -> new FoodTypes(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'foodTypes'.
   */
  public static BeanDefinition getFoodTypesBeanDefinition() {
    Class<?> beanType = FoodTypes.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setScope("session");
    beanDefinition.setAutowireCandidate(false);
    beanDefinition.setInstanceSupplier(getFoodTypesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Create the scoped proxy bean instance for 'foodTypes'.
   */
  private static ScopedProxyFactoryBean getFoodTypesScopedProxyInstance(
      RegisteredBean registeredBean) {
    ScopedProxyFactoryBean factory = new ScopedProxyFactoryBean();
    factory.setTargetBeanName("scopedTarget.foodTypes");
    factory.setBeanFactory(registeredBean.getBeanFactory());
    return factory;
  }

  /**
   * Get the bean definition for 'foodTypes'.
   */
  public static BeanDefinition getFoodTypesBeanDefinition1() {
    Class<?> beanType = FoodTypes.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(InstanceSupplier.of(FoodTypes__TestContext001_BeanDefinitions::getFoodTypesScopedProxyInstance));
    return beanDefinition;
  }
}
