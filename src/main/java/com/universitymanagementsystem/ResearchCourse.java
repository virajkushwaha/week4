package com.universitymanagementsystem;

public class ResearchCourse extends CourseType {
    //Constructor to assign research course details
    ResearchCourse(String course, String department){
        super(course, department);
    }

    //Override the evaluation method to provide our own
    @Override
    public String evaluationMethod(){
        return "Research paper and thesis";
    }

}
