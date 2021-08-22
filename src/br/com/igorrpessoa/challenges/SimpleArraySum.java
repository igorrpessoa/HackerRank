package br.com.igorrpessoa.challenges;

import java.util.List;

public class SimpleArraySum {

    public static int simpleArraySum(List<Integer> ar) {
        return ar.stream().reduce(0,Integer::sum);
    }
}
