package com.example.capstone.pizza_delivery_service.model;

import java.lang.Class;
import org.springframework.aop.scope.ScopedProxyFactoryBean;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RegisteredBean;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link Dishes}.
 */
public class Dishes__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'scopedTarget.dishes'.
   */
  private static BeanInstanceSupplier<Dishes> getDishesInstanceSupplier() {
    return BeanInstanceSupplier.<Dishes>forConstructor(FoodTypes.class)
            .withGenerator((registeredBean, args) -> new Dishes(args.get(0)));
  }

  /**
   * Get the bean definition for 'dishes'.
   */
  public static BeanDefinition getDishesBeanDefinition() {
    Class<?> beanType = Dishes.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setScope("session");
    beanDefinition.setAutowireCandidate(false);
    beanDefinition.setInstanceSupplier(getDishesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Create the scoped proxy bean instance for 'dishes'.
   */
  private static ScopedProxyFactoryBean getDishesScopedProxyInstance(
      RegisteredBean registeredBean) {
    ScopedProxyFactoryBean factory = new ScopedProxyFactoryBean();
    factory.setTargetBeanName("scopedTarget.dishes");
    factory.setBeanFactory(registeredBean.getBeanFactory());
    return factory;
  }

  /**
   * Get the bean definition for 'dishes'.
   */
  public static BeanDefinition getDishesBeanDefinition1() {
    Class<?> beanType = Dishes.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(InstanceSupplier.of(Dishes__TestContext001_BeanDefinitions::getDishesScopedProxyInstance));
    return beanDefinition;
  }
}
