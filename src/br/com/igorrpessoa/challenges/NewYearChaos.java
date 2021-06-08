package br.com.igorrpessoa.challenges;

public class NewYearChaos {
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int bribe = 0;
        boolean chaotic = false;
        for(int i=0; i< q.length; i++) {
            if(q[i] - (i+1) > 2){
                chaotic = true;
                break;
            }
            for(int j = Math.max(0,q[i]-2); j <= i ; j++){
                if (q[i] < q[j]) {
                    bribe++;
                }
            }
        }
        if(!chaotic){
            System.out.println(bribe);
        } else {
            System.out.println("Too chaotic");
        }
    }
}
