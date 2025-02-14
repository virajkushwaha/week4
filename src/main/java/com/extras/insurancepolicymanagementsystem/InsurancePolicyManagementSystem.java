package com.extras.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class InsurancePolicyManagementSystem {

    public static void main(String[] args) {
        // Sample policies
        InsurancePolicy policy1 = new InsurancePolicy("P123", "Alice", LocalDate.now().plusDays(20), "Health", 5000);
        InsurancePolicy policy2 = new InsurancePolicy("P124", "Bob", LocalDate.now().plusDays(40), "Auto", 3000);
        InsurancePolicy policy3 = new InsurancePolicy("P125", "Carol", LocalDate.now().plusDays(10), "Home", 4000);
        InsurancePolicy policy4 = new InsurancePolicy("P126", "Alice", LocalDate.now().minusDays(5), "Health", 6000); // Expired policy

        // Storing policies using different Maps
        Map<String, InsurancePolicy> hashMap = new HashMap<>();
        Map<String, InsurancePolicy> linkedHashMap = new LinkedHashMap<>();
        TreeMap<LocalDate, InsurancePolicy> treeMap = new TreeMap<>();

        // Adding policies to the HashMap and LinkedHashMap
        addPolicy(hashMap, policy1);
        addPolicy(hashMap, policy2);
        addPolicy(hashMap, policy3);
        addPolicy(hashMap, policy4);
        System.out.println("===================================================================");

        linkedHashMap.putAll(hashMap); // Maintain insertion order

        // Adding policies to TreeMap (sorted by expiry date)
        for (InsurancePolicy policy : hashMap.values()) {
            treeMap.put(policy.getExpiryDate(), policy);
        }

        // Retrieve and manipulate policies
        System.out.println("Policy by Number (P123): " + retrievePolicyByNumber(hashMap, "P123"));
        System.out.println("===================================================================");
        System.out.println("Policies Expiring Soon: " + listPoliciesExpiringSoon(treeMap));
        System.out.println("===================================================================");
        System.out.println("Policies for Alice: " + listPoliciesByPolicyholder(hashMap, "Alice"));

        System.out.println("===================================================================");
        removeExpiredPolicies(hashMap);
        System.out.println("Policies after removing expired: " + hashMap.values());
    }


    public static void addPolicy(Map<String, InsurancePolicy> map, InsurancePolicy policy) {
        if (map.putIfAbsent(policy.getPolicyNumber(), policy) == null) {
            System.out.println("Policy added: " + policy);
        } else {
            System.out.println("Duplicate policy not added: " + policy);
        }
    }


    public static InsurancePolicy retrievePolicyByNumber(Map<String, InsurancePolicy> map, String policyNumber) {
        return map.get(policyNumber);
    }


    public static List<InsurancePolicy> listPoliciesExpiringSoon(TreeMap<LocalDate, InsurancePolicy> treeMap) {
        List<InsurancePolicy> expiringSoon = new ArrayList<>();
        LocalDate today = LocalDate.now();

        for (Map.Entry<LocalDate, InsurancePolicy> entry : treeMap.tailMap(today).entrySet()) {
            if (ChronoUnit.DAYS.between(today, entry.getKey()) <= 30) {
                expiringSoon.add(entry.getValue());
            }
        }
        return expiringSoon;
    }


    public static List<InsurancePolicy> listPoliciesByPolicyholder(Map<String, InsurancePolicy> map, String policyholderName) {
        List<InsurancePolicy> policies = new ArrayList<>();
        for (InsurancePolicy policy : map.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }


    public static void removeExpiredPolicies(Map<String, InsurancePolicy> map) {
        LocalDate today = LocalDate.now();
        map.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
        System.out.println("Expired policies removed.");
    }
}


