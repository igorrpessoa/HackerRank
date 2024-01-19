package br.com.igorrpessoa.challenges;

import java.util.List;
import java.util.stream.Collectors;

public class Pairs {
    public static int pairs(int k, List<Integer> arr) {
        int count = 0;
        // we should sort the array to later break the comparison early
        List<Integer> sortedArray = arr.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < sortedArray.size(); i++) {
            Integer current = sortedArray.get(i);
            for (int j = i + 1; j < sortedArray.size(); j++) {
                Integer diff = sortedArray.get(j) - current;
                // if it's higher than k means that there is no other pair with a good diff
                if (diff > k) {
                    break;
                } else if (diff == k) {
                    ++count;
                }
            }
        }
        return count;
    }
}
