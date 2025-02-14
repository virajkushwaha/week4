package com.universitymanagementsystem;

public class Main {
        public static void main(String[] args) {
            // Create a course catalog
            CourseCatalog catalog = new CourseCatalog();

            // Create courses for different departments
            Course<ExamCourse> mathExam = new Course<>(new ExamCourse("Mathematics 101", "Mathematics"));
            Course<AssignmentCourse> csAssignment = new Course<>(new AssignmentCourse("Data Structures", "Computer Science"));
            Course<ResearchCourse> physicsResearch = new Course<>(new ResearchCourse("Quantum Mechanics", "Physics"));

            // Add courses to the catalog
            catalog.addCourse(mathExam);
            catalog.addCourse(csAssignment);
            catalog.addCourse(physicsResearch);

            // Display all courses
            catalog.showCatalog();
        }
    }