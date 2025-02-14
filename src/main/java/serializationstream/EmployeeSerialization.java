package serializationstream;

import java.io.*;
import java.util.*;

// Employee class implementing Serializable
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", department='" + department + '\'' + ", salary=" + salary + '}';
    }
}

public class EmployeeSerialization {
    private static final String FILE_NAME = "E:\\CapgeminiTraining\\Program_Prerequisite\\Week4\\Day3_Streams\\src\\main\\java\\serializationstream\\employee.txt";

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "IT", 70000));
        employees.add(new Employee(3, "Charlie", "Finance", 65000));

        // Serialize employees list to file
        serializeEmployees(employees);

        // Deserialize and display employees from file
        List<Employee> deserializedEmployees = deserializeEmployees();
        if (deserializedEmployees != null) {
            System.out.println("Deserialized Employee List:");
            for (Employee emp : deserializedEmployees) {
                System.out.println(emp);
            }
        }
    }

    // Serialize employee list
    private static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employee data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving employee data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Deserialize employee list
    private static List<Employee> deserializeEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error retrieving employee data: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
