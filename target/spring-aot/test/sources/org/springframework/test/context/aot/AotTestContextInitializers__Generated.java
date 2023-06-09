package org.springframework.test.context.aot;

import com.example.capstone.pizza_delivery_service.AuthenticationTest__TestContext001_ApplicationContextInitializer;
import com.example.capstone.pizza_delivery_service.CustomerIntegrationTest__TestContext002_ApplicationContextInitializer;
import java.lang.Class;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Generated mappings for {@link AotTestContextInitializers}.
 */
public class AotTestContextInitializers__Generated {
  public static Map<String, Supplier<ApplicationContextInitializer<? extends ConfigurableApplicationContext>>> getContextInitializers(
      ) {
    Map<String, Supplier<ApplicationContextInitializer<? extends ConfigurableApplicationContext>>> map = new HashMap<>();
    map.put("com.example.capstone.pizza_delivery_service.AuthenticationTest", () -> new AuthenticationTest__TestContext001_ApplicationContextInitializer());
    map.put("com.example.capstone.pizza_delivery_service.CustomerIntegrationTest", () -> new CustomerIntegrationTest__TestContext002_ApplicationContextInitializer());
    map.put("com.example.capstone.pizza_delivery_service.PizzaDeliveryServiceApplicationTests", () -> new CustomerIntegrationTest__TestContext002_ApplicationContextInitializer());
    return map;
  }

  public static Map<String, Class<? extends ApplicationContextInitializer<?>>> getContextInitializerClasses(
      ) {
    Map<String, Class<? extends ApplicationContextInitializer<?>>> map = new HashMap<>();
    map.put("com.example.capstone.pizza_delivery_service.AuthenticationTest", AuthenticationTest__TestContext001_ApplicationContextInitializer.class);
    map.put("com.example.capstone.pizza_delivery_service.CustomerIntegrationTest", CustomerIntegrationTest__TestContext002_ApplicationContextInitializer.class);
    map.put("com.example.capstone.pizza_delivery_service.PizzaDeliveryServiceApplicationTests", CustomerIntegrationTest__TestContext002_ApplicationContextInitializer.class);
    return map;
  }
}
