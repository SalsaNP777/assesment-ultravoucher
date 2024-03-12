package org.logictest;

import java.util.List;

public class Main extends LogicTest {
    public static void main(String[] args) {
        String[] arr = {"cook", "save", "taste", "aves", "vase", "state", "map"};
        List<List<String>> result = anagram(arr);
        for (List<String> groupedAnagram : result){
            System.out.println(groupedAnagram);
        }
    }
}