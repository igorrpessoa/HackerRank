package br.com.igorrpessoa.challenges;

import java.util.HashMap;
import java.util.Objects;

public class MaxArraySum {

    // Complete the maxSubsetSum function below.
    public static int maxSubsetSum(int[] arr) {
        int[] finalArray = new int[arr.length];
        if(arr.length == 1) return arr[0];
        finalArray[0] = arr[0];
        finalArray[1] = Math.max(arr[1], arr[0]);
        for(int i = 2; i < arr.length; i++) {
            int aux = Math.max(arr[i], finalArray[i-2] + arr[i]);
            finalArray[i] = Math.max(aux, finalArray[i-1]);
        }
        return finalArray[finalArray.length-1];
    }


}
