package com.example.capstone.pizza_delivery_service.security;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Bean definitions for {@link WebSecurityConfig}.
 */
public class WebSecurityConfig__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'webSecurityConfig'.
   */
  public static BeanDefinition getWebSecurityConfigBeanDefinition() {
    Class<?> beanType = WebSecurityConfig.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(WebSecurityConfig.class);
    beanDefinition.setInstanceSupplier(WebSecurityConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'filterChain'.
   */
  private static BeanInstanceSupplier<SecurityFilterChain> getFilterChainInstanceSupplier() {
    return BeanInstanceSupplier.<SecurityFilterChain>forFactoryMethod(WebSecurityConfig.class, "filterChain", HttpSecurity.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebSecurityConfig.class).filterChain(args.get(0)));
  }

  /**
   * Get the bean definition for 'filterChain'.
   */
  public static BeanDefinition getFilterChainBeanDefinition() {
    Class<?> beanType = SecurityFilterChain.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getFilterChainInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'detailsService'.
   */
  private static BeanInstanceSupplier<UserDetailsService> getDetailsServiceInstanceSupplier() {
    return BeanInstanceSupplier.<UserDetailsService>forFactoryMethod(WebSecurityConfig.class, "detailsService")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebSecurityConfig.class).detailsService());
  }

  /**
   * Get the bean definition for 'detailsService'.
   */
  public static BeanDefinition getDetailsServiceBeanDefinition() {
    Class<?> beanType = UserDetailsService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<UserDetailsService> instanceSupplier = getDetailsServiceInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(UserDetailsService__TestContext002_Autowiring1::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'authProvider'.
   */
  private static BeanInstanceSupplier<AuthenticationProvider> getAuthProviderInstanceSupplier() {
    return BeanInstanceSupplier.<AuthenticationProvider>forFactoryMethod(WebSecurityConfig.class, "authProvider")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebSecurityConfig.class).authProvider());
  }

  /**
   * Get the bean definition for 'authProvider'.
   */
  public static BeanDefinition getAuthProviderBeanDefinition() {
    Class<?> beanType = AuthenticationProvider.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getAuthProviderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'encoder'.
   */
  private static BeanInstanceSupplier<PasswordEncoder> getEncoderInstanceSupplier() {
    return BeanInstanceSupplier.<PasswordEncoder>forFactoryMethod(WebSecurityConfig.class, "encoder")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebSecurityConfig.class).encoder());
  }

  /**
   * Get the bean definition for 'encoder'.
   */
  public static BeanDefinition getEncoderBeanDefinition() {
    Class<?> beanType = PasswordEncoder.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getEncoderInstanceSupplier());
    return beanDefinition;
  }
}
