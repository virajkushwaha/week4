package com.universitymanagementsystem;

// Generic class to manage any type of CourseType (Exam, Assignment, Research)
class Course<T extends CourseType> {
    private T courseType;

    // Constructor to initialize course type
    public Course(T courseType) {
        this.courseType = courseType;
    }

    // Get CourseType through getter
    public T getCourseType() {
        return courseType;
    }

    // Display Course Details
    @Override
    public String toString() {
        return courseType.toString();
    }
}

