package com.complex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
public class MultipleValuesSetExample {
    public static void main(String[] args) {
        // Create a HashMap of key as String List Of integers as Value
        HashMap<String, TreeSet<Integer>> wordFreqMap = new HashMap<>();
        // Create an array Of Occurrences
        Integer[] occurences = { 12, 8, 4, 1 };
        // Add TreeSet as value in the map
        wordFreqMap.put("the", new TreeSet<Integer>(Arrays.asList(occurences)));
        // Add TreeSet as value in the map
        wordFreqMap.put("at", new TreeSet<Integer>(Arrays.asList(new Integer[] { 28, 44, 22, 89 })));
        // Add TreeSet as value in the map
        wordFreqMap.put("from", new TreeSet<Integer>(Arrays.asList(new Integer[] { 39, 32, 73, 51 })));
        // Print the Map Contents
        System.out.println(wordFreqMap);
    }
}