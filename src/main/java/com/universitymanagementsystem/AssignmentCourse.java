package com.universitymanagementsystem;

public class AssignmentCourse extends CourseType {
    //Constructor to assign Assignment course details
    AssignmentCourse(String course, String department){
        super(course, department);
    }
    //Override the evaluation method to provide our own
    @Override
    public String evaluationMethod(){
        return "Assignment and Projects";
    }

}
