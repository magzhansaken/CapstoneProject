package com.example.capstone.pizza_delivery_service.repositories;

import java.lang.Class;
import java.lang.Object;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean__TestContext001_Autowiring3;
import org.springframework.data.repository.query.QueryLookupStrategy;

/**
 * Bean definitions for {@link OrderCartRepository}.
 */
public class OrderCartRepository__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'orderCartRepository'.
   */
  private static BeanInstanceSupplier<JpaRepositoryFactoryBean> getOrderCartRepositoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JpaRepositoryFactoryBean>forConstructor(Class.class)
            .withGenerator((registeredBean, args) -> new JpaRepositoryFactoryBean(args.get(0)));
  }

  /**
   * Get the bean definition for 'orderCartRepository'.
   */
  public static BeanDefinition getOrderCartRepositoryBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClassWithGenerics(JpaRepositoryFactoryBean.class, OrderCartRepository.class, Object.class, Object.class);
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setLazyInit(false);
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, "com.example.capstone.pizza_delivery_service.repositories.OrderCartRepository");
    beanDefinition.getPropertyValues().addPropertyValue("queryLookupStrategyKey", QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND);
    beanDefinition.getPropertyValues().addPropertyValue("lazyInit", false);
    beanDefinition.getPropertyValues().addPropertyValue("namedQueries", new RuntimeBeanReference("jpa.named-queries#3"));
    beanDefinition.getPropertyValues().addPropertyValue("repositoryFragments", new RuntimeBeanReference("jpa.OrderCartRepository.fragments#0"));
    beanDefinition.getPropertyValues().addPropertyValue("transactionManager", "transactionManager");
    beanDefinition.getPropertyValues().addPropertyValue("entityManager", new RuntimeBeanReference("jpaSharedEM_entityManagerFactory"));
    beanDefinition.getPropertyValues().addPropertyValue("escapeCharacter", '\\');
    beanDefinition.getPropertyValues().addPropertyValue("mappingContext", new RuntimeBeanReference("jpaMappingContext"));
    beanDefinition.getPropertyValues().addPropertyValue("enableDefaultTransactions", true);
    InstanceSupplier<JpaRepositoryFactoryBean> instanceSupplier = getOrderCartRepositoryInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(JpaRepositoryFactoryBean__TestContext001_Autowiring3::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
