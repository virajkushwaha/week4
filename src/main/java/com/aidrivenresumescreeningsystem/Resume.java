package com.aidrivenresumescreeningsystem;

// Generic class to process resumes for different job roles
public class Resume<T extends JobRole> {
    private T candidateRole;

    // Constructor
    public Resume(T candidateRole) {
        this.candidateRole = candidateRole;
    }

    // Get Candidate Role
    public T getCandidateRole() {
        return candidateRole;
    }

    // Evaluate Resume
    public boolean isEligible() {
        return candidateRole.evaluateCandidate();
    }

    @Override
    public String toString() {
        return candidateRole.toString() + " | Eligible: " + isEligible();
    }
}

