package br.com.igorrpessoa.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int size = a.size();
        Integer aPoints=0,bPoints=0;
        for(int i = 0; i < size; i++){
            if(a.get(i) > b.get(i)){
                aPoints++;
            }
            if(a.get(i) < b.get(i)){
                bPoints++;
            }
        }

        return Arrays.asList(aPoints,bPoints);
    }

}
