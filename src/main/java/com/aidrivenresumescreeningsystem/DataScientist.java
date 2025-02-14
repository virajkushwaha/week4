package com.aidrivenresumescreeningsystem;

// Data Scientist Role
public class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public boolean evaluateCandidate() {
        return getExperienceYears() >= 3; // Requires at least 3 years of experience
    }
}

