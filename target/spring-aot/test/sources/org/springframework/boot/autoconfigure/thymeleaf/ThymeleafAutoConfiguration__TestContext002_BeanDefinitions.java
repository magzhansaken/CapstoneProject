package org.springframework.boot.autoconfigure.thymeleaf;

import java.lang.Class;
import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.thymeleaf.extras.springsecurity6.dialect.SpringSecurityDialect;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;

/**
 * Bean definitions for {@link ThymeleafAutoConfiguration}.
 */
public class ThymeleafAutoConfiguration__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'thymeleafAutoConfiguration'.
   */
  public static BeanDefinition getThymeleafAutoConfigurationBeanDefinition() {
    Class<?> beanType = ThymeleafAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ThymeleafAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link ThymeleafAutoConfiguration.ThymeleafWebMvcConfiguration}.
   */
  public static class ThymeleafWebMvcConfiguration {
    /**
     * Get the bean definition for 'thymeleafWebMvcConfiguration'.
     */
    public static BeanDefinition getThymeleafWebMvcConfigurationBeanDefinition() {
      Class<?> beanType = ThymeleafAutoConfiguration.ThymeleafWebMvcConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(ThymeleafAutoConfiguration.ThymeleafWebMvcConfiguration::new);
      return beanDefinition;
    }

    /**
     * Bean definitions for {@link ThymeleafAutoConfiguration.ThymeleafWebMvcConfiguration.ThymeleafViewResolverConfiguration}.
     */
    public static class ThymeleafViewResolverConfiguration {
      /**
       * Get the bean definition for 'thymeleafViewResolverConfiguration'.
       */
      public static BeanDefinition getThymeleafViewResolverConfigurationBeanDefinition() {
        Class<?> beanType = ThymeleafAutoConfiguration.ThymeleafWebMvcConfiguration.ThymeleafViewResolverConfiguration.class;
        RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
        beanDefinition.setInstanceSupplier(ThymeleafAutoConfiguration.ThymeleafWebMvcConfiguration.ThymeleafViewResolverConfiguration::new);
        return beanDefinition;
      }

      /**
       * Get the bean instance supplier for 'thymeleafViewResolver'.
       */
      private static BeanInstanceSupplier<ThymeleafViewResolver> getThymeleafViewResolverInstanceSupplier(
          ) {
        return BeanInstanceSupplier.<ThymeleafViewResolver>forFactoryMethod(ThymeleafAutoConfiguration.ThymeleafWebMvcConfiguration.ThymeleafViewResolverConfiguration.class, "thymeleafViewResolver", ThymeleafProperties.class, SpringTemplateEngine.class)
                .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ThymeleafAutoConfiguration.ThymeleafWebMvcConfiguration.ThymeleafViewResolverConfiguration.class).thymeleafViewResolver(args.get(0), args.get(1)));
      }

      /**
       * Get the bean definition for 'thymeleafViewResolver'.
       */
      public static BeanDefinition getThymeleafViewResolverBeanDefinition() {
        Class<?> beanType = ThymeleafViewResolver.class;
        RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
        beanDefinition.setInstanceSupplier(getThymeleafViewResolverInstanceSupplier());
        return beanDefinition;
      }
    }
  }

  /**
   * Bean definitions for {@link ThymeleafAutoConfiguration.ThymeleafWebLayoutConfiguration}.
   */
  public static class ThymeleafWebLayoutConfiguration {
    /**
     * Get the bean definition for 'thymeleafWebLayoutConfiguration'.
     */
    public static BeanDefinition getThymeleafWebLayoutConfigurationBeanDefinition() {
      Class<?> beanType = ThymeleafAutoConfiguration.ThymeleafWebLayoutConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(ThymeleafAutoConfiguration.ThymeleafWebLayoutConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'layoutDialect'.
     */
    private static BeanInstanceSupplier<LayoutDialect> getLayoutDialectInstanceSupplier() {
      return BeanInstanceSupplier.<LayoutDialect>forFactoryMethod(ThymeleafAutoConfiguration.ThymeleafWebLayoutConfiguration.class, "layoutDialect")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ThymeleafAutoConfiguration.ThymeleafWebLayoutConfiguration.class).layoutDialect());
    }

    /**
     * Get the bean definition for 'layoutDialect'.
     */
    public static BeanDefinition getLayoutDialectBeanDefinition() {
      Class<?> beanType = LayoutDialect.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getLayoutDialectInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link ThymeleafAutoConfiguration.ThymeleafSecurityDialectConfiguration}.
   */
  public static class ThymeleafSecurityDialectConfiguration {
    /**
     * Get the bean definition for 'thymeleafSecurityDialectConfiguration'.
     */
    public static BeanDefinition getThymeleafSecurityDialectConfigurationBeanDefinition() {
      Class<?> beanType = ThymeleafAutoConfiguration.ThymeleafSecurityDialectConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(ThymeleafAutoConfiguration.ThymeleafSecurityDialectConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'securityDialect'.
     */
    private static BeanInstanceSupplier<SpringSecurityDialect> getSecurityDialectInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<SpringSecurityDialect>forFactoryMethod(ThymeleafAutoConfiguration.ThymeleafSecurityDialectConfiguration.class, "securityDialect")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ThymeleafAutoConfiguration.ThymeleafSecurityDialectConfiguration.class).securityDialect());
    }

    /**
     * Get the bean definition for 'securityDialect'.
     */
    public static BeanDefinition getSecurityDialectBeanDefinition() {
      Class<?> beanType = SpringSecurityDialect.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getSecurityDialectInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link ThymeleafAutoConfiguration.DefaultTemplateResolverConfiguration}.
   */
  public static class DefaultTemplateResolverConfiguration {
    /**
     * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration$DefaultTemplateResolverConfiguration'.
     */
    private static BeanInstanceSupplier<ThymeleafAutoConfiguration.DefaultTemplateResolverConfiguration> getDefaultTemplateResolverConfigurationInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ThymeleafAutoConfiguration.DefaultTemplateResolverConfiguration>forConstructor(ThymeleafProperties.class, ApplicationContext.class)
              .withGenerator((registeredBean, args) -> new ThymeleafAutoConfiguration.DefaultTemplateResolverConfiguration(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'defaultTemplateResolverConfiguration'.
     */
    public static BeanDefinition getDefaultTemplateResolverConfigurationBeanDefinition() {
      Class<?> beanType = ThymeleafAutoConfiguration.DefaultTemplateResolverConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getDefaultTemplateResolverConfigurationInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'defaultTemplateResolver'.
     */
    private static BeanInstanceSupplier<SpringResourceTemplateResolver> getDefaultTemplateResolverInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<SpringResourceTemplateResolver>forFactoryMethod(ThymeleafAutoConfiguration.DefaultTemplateResolverConfiguration.class, "defaultTemplateResolver")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ThymeleafAutoConfiguration.DefaultTemplateResolverConfiguration.class).defaultTemplateResolver());
    }

    /**
     * Get the bean definition for 'defaultTemplateResolver'.
     */
    public static BeanDefinition getDefaultTemplateResolverBeanDefinition() {
      Class<?> beanType = SpringResourceTemplateResolver.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getDefaultTemplateResolverInstanceSupplier());
      return beanDefinition;
    }
  }
}
