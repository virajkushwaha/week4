package com.extras.insurancepolicymanagement;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class InsurancePolicyManagement {

    public static void main(String[] args) {
        // Sample policies
        InsurancePolicy policy1 = new InsurancePolicy("P123", "Aman", LocalDate.now().plusDays(20), "Health", 5000);
        InsurancePolicy policy2 = new InsurancePolicy("P124", "Pooja", LocalDate.now().plusDays(40), "Auto", 3000);
        InsurancePolicy policy3 = new InsurancePolicy("P125", "Chaman", LocalDate.now().plusDays(10), "Home", 4000);
        InsurancePolicy policy4 = new InsurancePolicy("P123", "Aman", LocalDate.now().plusDays(20), "Health", 5000); // Duplicate policy

        // Using HashSet
        Set<InsurancePolicy> hashSet = new HashSet<>();
        addPolicy(hashSet, policy1);
        addPolicy(hashSet, policy2);
        addPolicy(hashSet, policy3);
        addPolicy(hashSet, policy4); // Duplicate will not be added
        System.out.println("========================================================================");

        System.out.println("HashSet Policies: " + hashSet);
        System.out.println("========================================================================");

        // Using LinkedHashSet
        Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(hashSet);
        System.out.println("LinkedHashSet Policies (Order Maintained): " + linkedHashSet);
        System.out.println("========================================================================");

        // Using TreeSet (sorted by expiry date)
        Set<InsurancePolicy> treeSet = new TreeSet<>(Comparator.comparing(InsurancePolicy::getExpiryDate));
        treeSet.addAll(hashSet);
        System.out.println("TreeSet Policies (Sorted by Expiry Date): " + treeSet);
        System.out.println("========================================================================");

        // Retrieve policies expiring within the next 30 days
        System.out.println("Policies Expiring Soon: " + getPoliciesExpiringSoon(treeSet));
        System.out.println("========================================================================");

        // Retrieve policies with specific coverage type
        System.out.println("Health Coverage Policies: " + getPoliciesByCoverageType(treeSet, "Health"));
        System.out.println("========================================================================");

        // Identify duplicate policies by policy number
        System.out.println("Duplicate Policies: " + findDuplicatePolicies(Arrays.asList(policy1, policy2, policy3, policy4)));
        System.out.println("========================================================================");
    }


    public static void addPolicy(Set<InsurancePolicy> set, InsurancePolicy policy) {
        if (set.add(policy)) {
            System.out.println("Policy added: " + policy);
        } else {
            System.out.println("Duplicate policy (not added): " + policy);
        }
    }

    public static List<InsurancePolicy> getPoliciesExpiringSoon(Set<InsurancePolicy> policies) {
        List<InsurancePolicy> expiringSoon = new ArrayList<>();
        LocalDate today = LocalDate.now();

        for (InsurancePolicy policy : policies) {
            if (ChronoUnit.DAYS.between(today, policy.getExpiryDate()) <= 30) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    public static List<InsurancePolicy> getPoliciesByCoverageType(Set<InsurancePolicy> policies, String coverageType) {
        List<InsurancePolicy> filteredPolicies = new ArrayList<>();

        for (InsurancePolicy policy : policies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                filteredPolicies.add(policy);
            }
        }
        return filteredPolicies;
    }


    public static Set<InsurancePolicy> findDuplicatePolicies(List<InsurancePolicy> policies) {
        Set<String> seenPolicyNumbers = new HashSet<>();
        Set<InsurancePolicy> duplicates = new HashSet<>();

        for (InsurancePolicy policy : policies) {
            if (!seenPolicyNumbers.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }
}




