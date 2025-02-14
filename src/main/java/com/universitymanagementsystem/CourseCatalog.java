package com.universitymanagementsystem;

import java.util.ArrayList;
import java.util.List;

class CourseCatalog {
    // Allows any CourseType
    private List<Course<? extends CourseType>> courses;

    // Constructor
    public CourseCatalog() {
        courses = new ArrayList<>();
    }

    // Add a course to the catalog
    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    // Display all courses
    public void showCatalog() {
        System.out.println("\n--- University Course Catalog ---");
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
            System.out.println("==========================================================");
        }
    }
}

