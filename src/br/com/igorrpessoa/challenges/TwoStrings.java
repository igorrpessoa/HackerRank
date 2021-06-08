package br.com.igorrpessoa.challenges;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        boolean hasSubstring = false;
        Set<String> substringSet = new HashSet<>();
        String[] list =  s1.split("");
        for (int i = 0; i < list.length; i++) {
            substringSet.add(list[i]);
        }

        for (String  key : substringSet) {
            if(s2.contains(key)) {
                hasSubstring = true;
                break;
            }
        }
        return hasSubstring ? "YES" : "NO";
    }

}
