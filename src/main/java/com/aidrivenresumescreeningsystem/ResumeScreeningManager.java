package com.aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningManager {
    private List<Resume<? extends JobRole>> resumes; // Wildcard for multiple job roles

    // Constructor
    public ResumeScreeningManager() {
        resumes = new ArrayList<>();
    }

    // Add Resume to the screening process
    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }

    // Process and display all resumes
    public void processResumes() {
        System.out.println("\n--- AI-Driven Resume Screening ---");
        for (Resume<? extends JobRole> resume : resumes) {
            System.out.println(resume);
        }
    }
}

