package org.springframework.boot.test.autoconfigure.web.servlet;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MockMvcSecurityConfiguration}.
 */
public class MockMvcSecurityConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'mockMvcSecurityConfiguration'.
   */
  public static BeanDefinition getMockMvcSecurityConfigurationBeanDefinition() {
    Class<?> beanType = MockMvcSecurityConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(MockMvcSecurityConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'securityMockMvcBuilderCustomizer'.
   */
  private static BeanInstanceSupplier<MockMvcSecurityConfiguration.SecurityMockMvcBuilderCustomizer> getSecurityMockMvcBuilderCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MockMvcSecurityConfiguration.SecurityMockMvcBuilderCustomizer>forFactoryMethod(MockMvcSecurityConfiguration.class, "securityMockMvcBuilderCustomizer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(MockMvcSecurityConfiguration.class).securityMockMvcBuilderCustomizer());
  }

  /**
   * Get the bean definition for 'securityMockMvcBuilderCustomizer'.
   */
  public static BeanDefinition getSecurityMockMvcBuilderCustomizerBeanDefinition() {
    Class<?> beanType = MockMvcSecurityConfiguration.SecurityMockMvcBuilderCustomizer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getSecurityMockMvcBuilderCustomizerInstanceSupplier());
    return beanDefinition;
  }
}
