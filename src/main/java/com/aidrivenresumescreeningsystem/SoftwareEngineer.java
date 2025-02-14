package com.aidrivenresumescreeningsystem;

// Software Engineer Role
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public boolean evaluateCandidate() {
        return getExperienceYears() >= 2; // Requires at least 2 years of experience
    }
}
