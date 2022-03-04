package br.com.igorrpessoa.challenges;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    public static int minimumSwaps(int[] arr) {
        int swapCount = 0;
        int i =0;
        while (i < arr.length) {
            if (arr[i] != i+1) {
                int aux = arr[i];
                arr[i] = arr[aux-1];
                arr[aux-1] = aux;
                ++swapCount;
            }
            if(arr[i] == i+1){
                ++i;
            }
        }

        return swapCount;
    }

}
