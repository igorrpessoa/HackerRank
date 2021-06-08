package br.com.igorrpessoa.challenges;

import java.util.HashSet;
import java.util.Set;

public class StringConstruction {
    // Complete the stringConstruction function below.
    static int stringConstruction(String s) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String substring = String.valueOf(s.charAt(i));
            if(!set.contains(substring)){
                set.add(substring);
            }
        }
        return set.size();
    }
}
