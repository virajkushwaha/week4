package com.universitymanagementsystem;
public class ExamCourse extends CourseType{
    //Constructor to assign Exam course details
    ExamCourse(String course, String department){
        super(course, department);
    }
    //Override the evaluation method to provide our own
    @Override
    public String evaluationMethod(){
        return "Final Exam";
    }
}
