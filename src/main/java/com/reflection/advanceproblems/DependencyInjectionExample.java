package reflection.advanceproblems;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

// Define the @Inject annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

// Define a service class
class Service {
    public void serve() {
        System.out.println("Service is serving...");
    }
}

// Define a client class that depends on the Service
class Client {
    @Inject
    private Service service;

    public void doWork() {
        service.serve();
    }
}

// Simple Dependency Injection container
class DIContainer {

    public static <T> T createInstance(Class<T> clazz) {
        try {
            // Create an instance of the class
            Constructor<T> constructor = clazz.getDeclaredConstructor();
            T instance = constructor.newInstance();

            // Inject dependencies into fields annotated with @Inject
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    // Find the type of the field
                    Class<?> dependencyType = field.getType();

                    // Create an instance of the dependency
                    Object dependency = createInstance(dependencyType);

                    // Make the field accessible and set the dependency
                    field.setAccessible(true);
                    field.set(instance, dependency);
                }
            }

            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Dependency Injection failed", e);
        }
    }
}

public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Create the client instance using the DI container
        Client client = DIContainer.createInstance(Client.class);

        // Call the method on the client
        client.doWork();
    }
}

