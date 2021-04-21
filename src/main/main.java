/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author HP ProBook
 */
public class main {
//    Sorting an ArrayList

    public static void main(String[] args) {
        System.out.println("\n\tExercise 1");
        SortingArrays();
//        Exercise 2
        System.out.println("\n\tExercise 2");
        ShufflingArray();
//        Exercise 3
        System.out.println("\n\tExercise 3");
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(1);
        integers.add(7);
        integers.add(10);
        integers.add(2);
        preserveOrder(integers);
//      Exercise6
        System.out.println("\n\tExercise 6");
        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(18);
        numSet.add(20);
        numSet.add(28);
        numSet.add(15);
        numSet.add(6);
        Set<Integer> numSet_2 = new HashSet<>();
        numSet_2.add(30);
        numSet_2.add(15);
        numSet_2.add(25);
        numSet_2.add(24);
        numSet_2.add(11);
        numSet_2.add(3);
        compareTwoSets(numSet, numSet_2);
//        Exercise7
        System.out.println("\n\tExercise 7");
        Set<String> string = new HashSet<>();
        string.add("Kylie");
        string.add("Kim");
        string.add("Kendall");
        string.add("Jenner");
        string.add("Kardashian");
        Set<String> string_2 = new HashSet<>();
        string_2.add("Kardashian");
        string_2.add("Khloe");
        string_2.add("Kourtney");
        string_2.add("Kris");
        string_2.add("Jenner");
        displayUniqueValues(string, string_2);
        //    Exercise 8
        System.out.println("\n\tExercise 8");
        Map<String, String> callsign = new HashMap<>();
        callsign.put("concordia", "baby");
        callsign.put("acconcordia", "babe");
        callsign.put("condensada", "love");
        countMapKeys(callsign);

    }

//  _________________________________________________________  
//............Java Functions in every numbers..............|
//  _________________________________________________________|
//Exercise1
    public static void SortingArrays() {
        List<String> names = new ArrayList<>();
        names.add("Charles Kirby");
        names.add("Zephanie Blaire");
        names.add("Gladys Jean");
        names.add("Jane Xyrene");
        System.out.println("Original Arrangement: " + names);
        Collections.sort(names);
        System.out.println("Sorted names: ");
        names.forEach(name -> {
            System.out.println(name);
        });
    }
//    Exercise 2

    public static void ShufflingArray() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(16);
        numbers.add(6);
        numbers.add(26);
        numbers.add(14);
        numbers.add(9);
        numbers.add(23);
        numbers.add(10);
        numbers.add(3);
        numbers.add(29);
        System.out.println("Original Numbers: " + numbers);
        Collections.shuffle(numbers);
        System.out.println("Shuffled Numbers: ");
        numbers.forEach(num -> {
            System.out.println(num);
        });
    }
//    Exercise 3

    public static void preserveOrder(List<Integer> integers) {
        System.out.println("Original arraylist: " + integers);
        int min_num = Collections.min(integers);
        integers.remove(integers.indexOf(min_num));
        integers.add(0, min_num);
        System.out.println(integers);
    }

//    Exercise 6
    public static void compareTwoSets(Set<Integer> numSet, Set<Integer> numSet_2) {
        System.out.println("First Set: " + numSet);
        System.out.println("Second set: " + numSet_2);
        numSet.retainAll(numSet_2);
        System.out.println("Common Values: " + numSet);

    }
//    Exercise 7

    public static void displayUniqueValues(Set<String> string, Set<String> string_2) {
        System.out.println("First set: " + string);
        System.out.println("Second set: " + string_2);
        Set<String> uniqueSet1 = new HashSet<>(string);
        uniqueSet1.removeAll(string_2);
        Set<String> uniqueSet2 = new HashSet<>(string_2);
        uniqueSet2.removeAll(string);
        uniqueSet1.addAll(uniqueSet2);
        System.out.println("Unique Values: " + uniqueSet1);
    }
//    Exercise 8

    public static void countMapKeys(Map<String, String> map) {
        int counter = 0;
        for (Map.Entry<String, String> value : map.entrySet()) {
            if (value.getKey().substring(0, 9).contains("concordia")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
