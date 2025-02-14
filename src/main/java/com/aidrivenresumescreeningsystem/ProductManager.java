package com.aidrivenresumescreeningsystem;
// Product Manager Role
public class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public boolean evaluateCandidate() {
        return getExperienceYears() >= 5; // Requires at least 5 years of experience
    }
}
