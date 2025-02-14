package com.universitymanagementsystem;

public abstract class CourseType {
    //Private data methods of courseType class
    private String courseName;
    private String departmentName;

    //Constructor to initialize values
    CourseType(String courseName, String departmentName){
        this.courseName = courseName;
        this.departmentName = departmentName;
    }

    //Getters for course and department name
    public String getCourseName(){
        return courseName;
    }
    public String getDepartmentName(){
        return departmentName;
    }

    //method to specify the evaluation method of a course
    public abstract String evaluationMethod();

    //override the output string
    @Override
    public String toString(){
        return "Course Name: " + courseName + "\nDepartment Name: " + departmentName +"\nEvaluation Method: "+ evaluationMethod();
    }
}
