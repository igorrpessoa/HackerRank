package br.com.igorrpessoa.challenges;

import java.util.Arrays;

public class GreedyFlorist {
    // Complete the getMinimumCost function below.
    public static int getMinimumCost(int k, int[] c) {

        int sum = 0;
        int[] flowersBought = new int[k];
        int personIndex =0;
        Arrays.sort(c);
        for(int i = c.length-1; i >= 0 ; i--) {
            sum += Math.multiplyExact(c[i], (flowersBought[personIndex] + 1));
            ++flowersBought[personIndex];
            if(personIndex == k-1) {
                personIndex = 0;
            } else {
                personIndex++;
            }
        }
        return sum;
    }

}
