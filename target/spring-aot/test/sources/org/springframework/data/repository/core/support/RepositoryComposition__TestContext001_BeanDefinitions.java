package org.springframework.data.repository.core.support;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link RepositoryComposition}.
 */
public class RepositoryComposition__TestContext001_BeanDefinitions {
  /**
   * Bean definitions for {@link RepositoryComposition.RepositoryFragments}.
   */
  public static class RepositoryFragments {
    /**
     * Get the bean instance supplier for 'jpa.OrderDetailsRepository.fragments#0'.
     */
    private static BeanInstanceSupplier<RepositoryFragmentsFactoryBean> getFragmentsInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<RepositoryFragmentsFactoryBean>forConstructor(List.class)
              .withGenerator((registeredBean, args) -> new RepositoryFragmentsFactoryBean(args.get(0)));
    }

    /**
     * Get the bean definition for 'fragments#0'.
     */
    public static BeanDefinition getFragmentsBeanDefinition() {
      ResolvableType beanType = ResolvableType.forClass(RepositoryFragmentsFactoryBean.class);
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, Collections.emptyList());
      beanDefinition.setInstanceSupplier(getFragmentsInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jpa.CustomersCredentialsRepository.fragments#0'.
     */
    private static BeanInstanceSupplier<RepositoryFragmentsFactoryBean> getFragmentsInstanceSupplier1(
        ) {
      return BeanInstanceSupplier.<RepositoryFragmentsFactoryBean>forConstructor(List.class)
              .withGenerator((registeredBean, args) -> new RepositoryFragmentsFactoryBean(args.get(0)));
    }

    /**
     * Get the bean definition for 'fragments#0'.
     */
    public static BeanDefinition getFragmentsBeanDefinition1() {
      ResolvableType beanType = ResolvableType.forClass(RepositoryFragmentsFactoryBean.class);
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, Collections.emptyList());
      beanDefinition.setInstanceSupplier(getFragmentsInstanceSupplier1());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jpa.FoodTypesRepository.fragments#0'.
     */
    private static BeanInstanceSupplier<RepositoryFragmentsFactoryBean> getFragmentsInstanceSupplier2(
        ) {
      return BeanInstanceSupplier.<RepositoryFragmentsFactoryBean>forConstructor(List.class)
              .withGenerator((registeredBean, args) -> new RepositoryFragmentsFactoryBean(args.get(0)));
    }

    /**
     * Get the bean definition for 'fragments#0'.
     */
    public static BeanDefinition getFragmentsBeanDefinition2() {
      ResolvableType beanType = ResolvableType.forClass(RepositoryFragmentsFactoryBean.class);
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, Collections.emptyList());
      beanDefinition.setInstanceSupplier(getFragmentsInstanceSupplier2());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jpa.OrderCartRepository.fragments#0'.
     */
    private static BeanInstanceSupplier<RepositoryFragmentsFactoryBean> getFragmentsInstanceSupplier3(
        ) {
      return BeanInstanceSupplier.<RepositoryFragmentsFactoryBean>forConstructor(List.class)
              .withGenerator((registeredBean, args) -> new RepositoryFragmentsFactoryBean(args.get(0)));
    }

    /**
     * Get the bean definition for 'fragments#0'.
     */
    public static BeanDefinition getFragmentsBeanDefinition3() {
      ResolvableType beanType = ResolvableType.forClass(RepositoryFragmentsFactoryBean.class);
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, Collections.emptyList());
      beanDefinition.setInstanceSupplier(getFragmentsInstanceSupplier3());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jpa.ToppingsRepository.fragments#0'.
     */
    private static BeanInstanceSupplier<RepositoryFragmentsFactoryBean> getFragmentsInstanceSupplier4(
        ) {
      return BeanInstanceSupplier.<RepositoryFragmentsFactoryBean>forConstructor(List.class)
              .withGenerator((registeredBean, args) -> new RepositoryFragmentsFactoryBean(args.get(0)));
    }

    /**
     * Get the bean definition for 'fragments#0'.
     */
    public static BeanDefinition getFragmentsBeanDefinition4() {
      ResolvableType beanType = ResolvableType.forClass(RepositoryFragmentsFactoryBean.class);
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, Collections.emptyList());
      beanDefinition.setInstanceSupplier(getFragmentsInstanceSupplier4());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jpa.AuthGroupRepository.fragments#0'.
     */
    private static BeanInstanceSupplier<RepositoryFragmentsFactoryBean> getFragmentsInstanceSupplier5(
        ) {
      return BeanInstanceSupplier.<RepositoryFragmentsFactoryBean>forConstructor(List.class)
              .withGenerator((registeredBean, args) -> new RepositoryFragmentsFactoryBean(args.get(0)));
    }

    /**
     * Get the bean definition for 'fragments#0'.
     */
    public static BeanDefinition getFragmentsBeanDefinition5() {
      ResolvableType beanType = ResolvableType.forClass(RepositoryFragmentsFactoryBean.class);
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, Collections.emptyList());
      beanDefinition.setInstanceSupplier(getFragmentsInstanceSupplier5());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jpa.DishesRepository.fragments#0'.
     */
    private static BeanInstanceSupplier<RepositoryFragmentsFactoryBean> getFragmentsInstanceSupplier6(
        ) {
      return BeanInstanceSupplier.<RepositoryFragmentsFactoryBean>forConstructor(List.class)
              .withGenerator((registeredBean, args) -> new RepositoryFragmentsFactoryBean(args.get(0)));
    }

    /**
     * Get the bean definition for 'fragments#0'.
     */
    public static BeanDefinition getFragmentsBeanDefinition6() {
      ResolvableType beanType = ResolvableType.forClass(RepositoryFragmentsFactoryBean.class);
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, Collections.emptyList());
      beanDefinition.setInstanceSupplier(getFragmentsInstanceSupplier6());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jpa.OrdersRepository.fragments#0'.
     */
    private static BeanInstanceSupplier<RepositoryFragmentsFactoryBean> getFragmentsInstanceSupplier7(
        ) {
      return BeanInstanceSupplier.<RepositoryFragmentsFactoryBean>forConstructor(List.class)
              .withGenerator((registeredBean, args) -> new RepositoryFragmentsFactoryBean(args.get(0)));
    }

    /**
     * Get the bean definition for 'fragments#0'.
     */
    public static BeanDefinition getFragmentsBeanDefinition7() {
      ResolvableType beanType = ResolvableType.forClass(RepositoryFragmentsFactoryBean.class);
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, Collections.emptyList());
      beanDefinition.setInstanceSupplier(getFragmentsInstanceSupplier7());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jpa.PaymentRepository.fragments#0'.
     */
    private static BeanInstanceSupplier<RepositoryFragmentsFactoryBean> getFragmentsInstanceSupplier8(
        ) {
      return BeanInstanceSupplier.<RepositoryFragmentsFactoryBean>forConstructor(List.class)
              .withGenerator((registeredBean, args) -> new RepositoryFragmentsFactoryBean(args.get(0)));
    }

    /**
     * Get the bean definition for 'fragments#0'.
     */
    public static BeanDefinition getFragmentsBeanDefinition8() {
      ResolvableType beanType = ResolvableType.forClass(RepositoryFragmentsFactoryBean.class);
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, Collections.emptyList());
      beanDefinition.setInstanceSupplier(getFragmentsInstanceSupplier8());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jpa.CustomersRepository.fragments#0'.
     */
    private static BeanInstanceSupplier<RepositoryFragmentsFactoryBean> getFragmentsInstanceSupplier9(
        ) {
      return BeanInstanceSupplier.<RepositoryFragmentsFactoryBean>forConstructor(List.class)
              .withGenerator((registeredBean, args) -> new RepositoryFragmentsFactoryBean(args.get(0)));
    }

    /**
     * Get the bean definition for 'fragments#0'.
     */
    public static BeanDefinition getFragmentsBeanDefinition9() {
      ResolvableType beanType = ResolvableType.forClass(RepositoryFragmentsFactoryBean.class);
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, Collections.emptyList());
      beanDefinition.setInstanceSupplier(getFragmentsInstanceSupplier9());
      return beanDefinition;
    }
  }
}
