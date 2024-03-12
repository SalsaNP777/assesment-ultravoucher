package org.logictest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LogicTest {
    public static List<List<String>> anagram(String[] arr){
        List<List<String>> groupAnagrams = new ArrayList<>();
        String[] sortedWords = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            char[] charArr = arr[i].toCharArray();
            Arrays.sort(charArr);
            sortedWords[i] = new String(charArr);
        }

        boolean[] visit = new boolean[arr.length];
        Arrays.fill(visit, false);

        for (int i = 0; i < sortedWords.length; i++) {
            if (!visit[i]) {
                List<String> currentGroup = new ArrayList<>();
                currentGroup.add(arr[i]);

                for (int j = i + 1; j < sortedWords.length; j++) {
                    if (!visit[j] && sortedWords[i].equals(sortedWords[j])) {
                        currentGroup.add(arr[j]);
                        visit[j] = true;
                    }
                }

                visit[i] = true;

                groupAnagrams.add(currentGroup);
            }
        }

        return groupAnagrams;
    }
}
