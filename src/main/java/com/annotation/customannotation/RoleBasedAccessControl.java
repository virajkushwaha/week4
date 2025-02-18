package annotation.customannotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Define the @RoleAllowed annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value(); // Role allowed to access the method
}

// Class with role-based access control
class AccessControl {

    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed.");
    }

    @RoleAllowed("USER")
    public void userTask() {
        System.out.println("User task executed.");
    }
}

// Main class to simulate role-based access control
public class RoleBasedAccessControl {
    public static void main(String[] args) throws Exception {
        AccessControl accessControl = new AccessControl();
        String currentUserRole = "USER"; // Simulate current user role

        for (Method method : AccessControl.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

                if (roleAllowed.value().equals(currentUserRole)) {
                    method.invoke(accessControl);
                } else {
                    System.out.println("Access Denied! Method: " + method.getName());
                }
            }
        }
    }
}

