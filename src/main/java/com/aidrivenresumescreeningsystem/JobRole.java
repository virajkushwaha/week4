package com.aidrivenresumescreeningsystem;

// Abstract class representing different job roles
abstract class JobRole {
    private String candidateName;
    private int experienceYears;

    // Constructor
    public JobRole(String candidateName, int experienceYears) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
    }

    // Abstract method for role-specific evaluation criteria
    public abstract boolean evaluateCandidate();

    // Get candidate details
    public String getCandidateName() {
        return candidateName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public String toString() {
        return "Candidate: " + candidateName + " | Experience: " + experienceYears + " years | Role: " + this.getClass().getSimpleName();
    }
}

