package reflection.advanceproblems;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Define an interface
interface Greeting {
    void sayHello(String name);
}

// Implementation of the interface
class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

// Custom InvocationHandler for logging
class LoggingHandler implements InvocationHandler {
    private final Object target;

    // Constructor to wrap the target object
    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log method name before invocation
        System.out.println("Method called: " + method.getName());
        return method.invoke(target, args); // Call the actual method
    }
}

public class CustomLoggingProxy {
    public static void main(String[] args) {
        // Create the target object
        Greeting greeting = new GreetingImpl();

        // Create a proxy for the target object
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingHandler(greeting)
        );

        // Call the method via proxy
        proxy.sayHello("Alice");
    }
}
