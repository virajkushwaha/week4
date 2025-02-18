package annotation.customannotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

// Define the @CacheResult annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

// Class with computationally expensive method
class ExpensiveOperations {

    private final Map<String, Integer> cache = new HashMap<>();

    @CacheResult
    public int expensiveCalculation(int number) {
        System.out.println("Performing expensive calculation for: " + number);
        return number * number; // Example computation
    }

    // Custom caching mechanism
    public int callWithCache(int number) throws Exception {
        String cacheKey = "expensiveCalculation:" + number;

        if (cache.containsKey(cacheKey)) {
            System.out.println("Returning cached result for: " + number);
            return cache.get(cacheKey);
        }

        Method method = ExpensiveOperations.class.getDeclaredMethod("expensiveCalculation", int.class);
        if (method.isAnnotationPresent(CacheResult.class)) {
            int result = (int) method.invoke(this, number);
            cache.put(cacheKey, result);
            return result;
        }

        throw new IllegalStateException("Method not annotated with @CacheResult");
    }
}

// Main class to test caching system
public class CustomCachingSystem {
    public static void main(String[] args) throws Exception {
        ExpensiveOperations operations = new ExpensiveOperations();

        // First call (calculation happens)
        System.out.println("Result: " + operations.callWithCache(5));

        // Second call (cached result is returned)
        System.out.println("Result: " + operations.callWithCache(5));

        // Call with a different input
        System.out.println("Result: " + operations.callWithCache(10));
    }
}

