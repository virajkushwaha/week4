package com.queueinterface;

import java.util.*;

public class HospitalTriageSystem {
    public static void main(String[] args) {
        // Creating a PriorityQueue for patients
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(
                Comparator.comparingInt(Patient::getSeverity).reversed()
        );

        // Adding patients to the queue
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        // Printing patients in order of treatment
        System.out.println("Order of treatment:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll());
        }
    }
}

// Patient class representing a patient with name and severity
class Patient {
    private String name;
    private int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public int getSeverity() {
        return severity;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}
