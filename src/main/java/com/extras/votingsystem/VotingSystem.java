package com.extras.votingsystem;

import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        // Initialize the voting system
        VotingSystem votingSystem = new VotingSystem();

        // Cast votes
        votingSystem.castVote("Shivam");
        votingSystem.castVote("Pintu");
        votingSystem.castVote("Shivam");
        votingSystem.castVote("Zeesha");
        votingSystem.castVote("Pintu");
        votingSystem.castVote("Shivam");

        // Display the results
        System.out.println("Votes in HashMap (unsorted): " + votingSystem.getVotesHashMap());
        System.out.println("Votes in TreeMap (sorted by candidate name): " + votingSystem.getVotesTreeMap());
        System.out.println("Votes in LinkedHashMap (order of votes cast): " + votingSystem.getVotesLinkedHashMap());
    }

    private final HashMap<String, Integer> votesHashMap;
    //To maintain order
    private final LinkedHashMap<String, Integer> votesLinkedHashMap;
    // Sorts results by candidate name
    private final TreeMap<String, Integer> votesTreeMap;

    //Constructor
    public VotingSystem() {
        votesHashMap = new HashMap<>();
        votesLinkedHashMap = new LinkedHashMap<>();
        votesTreeMap = new TreeMap<>();
    }


    public void castVote(String candidate) {
        // Update votes in HashMap
        votesHashMap.put(candidate, votesHashMap.getOrDefault(candidate, 0) + 1);

        // Update votes in LinkedHashMap (maintains insertion order)
        votesLinkedHashMap.put(candidate, votesHashMap.get(candidate));

        // Update votes in TreeMap (sorts by candidate name)
        votesTreeMap.put(candidate, votesHashMap.get(candidate));
    }

    //Method to return HashMap
    public Map<String, Integer> getVotesHashMap() {
        return new HashMap<>(votesHashMap);
    }

    //Method to return TreeMap
    public Map<String, Integer> getVotesTreeMap() {
        return new TreeMap<>(votesTreeMap);
    }

    //Method to return LinkedHashMap
    public Map<String, Integer> getVotesLinkedHashMap() {
        return new LinkedHashMap<>(votesLinkedHashMap);
    }
}

