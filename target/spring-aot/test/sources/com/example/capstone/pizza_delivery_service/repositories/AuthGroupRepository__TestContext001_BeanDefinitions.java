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
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean__TestContext001_Autowiring5;
import org.springframework.data.repository.query.QueryLookupStrategy;

/**
 * Bean definitions for {@link AuthGroupRepository}.
 */
public class AuthGroupRepository__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'authGroupRepository'.
   */
  private static BeanInstanceSupplier<JpaRepositoryFactoryBean> getAuthGroupRepositoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JpaRepositoryFactoryBean>forConstructor(Class.class)
            .withGenerator((registeredBean, args) -> new JpaRepositoryFactoryBean(args.get(0)));
  }

  /**
   * Get the bean definition for 'authGroupRepository'.
   */
  public static BeanDefinition getAuthGroupRepositoryBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClassWithGenerics(JpaRepositoryFactoryBean.class, AuthGroupRepository.class, Object.class, Object.class);
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setLazyInit(false);
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, "com.example.capstone.pizza_delivery_service.repositories.AuthGroupRepository");
    beanDefinition.getPropertyValues().addPropertyValue("queryLookupStrategyKey", QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND);
    beanDefinition.getPropertyValues().addPropertyValue("lazyInit", false);
    beanDefinition.getPropertyValues().addPropertyValue("namedQueries", new RuntimeBeanReference("jpa.named-queries#5"));
    beanDefinition.getPropertyValues().addPropertyValue("repositoryFragments", new RuntimeBeanReference("jpa.AuthGroupRepository.fragments#0"));
    beanDefinition.getPropertyValues().addPropertyValue("transactionManager", "transactionManager");
    beanDefinition.getPropertyValues().addPropertyValue("entityManager", new RuntimeBeanReference("jpaSharedEM_entityManagerFactory"));
    beanDefinition.getPropertyValues().addPropertyValue("escapeCharacter", '\\');
    beanDefinition.getPropertyValues().addPropertyValue("mappingContext", new RuntimeBeanReference("jpaMappingContext"));
    beanDefinition.getPropertyValues().addPropertyValue("enableDefaultTransactions", true);
    InstanceSupplier<JpaRepositoryFactoryBean> instanceSupplier = getAuthGroupRepositoryInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(JpaRepositoryFactoryBean__TestContext001_Autowiring5::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
