package com.aidrivenresumescreeningsystem;

public class Main {
        public static void main(String[] args) {
            // Create Resume Screening Manager
            ResumeScreeningManager manager = new ResumeScreeningManager();

            // Create resumes for different job roles
            Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice Johnson", 3));
            Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob Smith", 2));
            Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie Brown", 6));

            // Add resumes to the screening pipeline
            manager.addResume(seResume);
            manager.addResume(dsResume);
            manager.addResume(pmResume);

            // Process and display all resumes
            manager.processResumes();
        }
    }
