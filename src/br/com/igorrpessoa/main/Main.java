package br.com.igorrpessoa.main;

import br.com.igorrpessoa.challenges.GreedyFlorist;
import br.com.igorrpessoa.challenges.MaxArraySum;
import br.com.igorrpessoa.challenges.MinimumSwaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int [] list = {1, 3, 5, 7, 9};
        list = readData();
        System.out.println(GreedyFlorist.getMinimumCost(3, list));
    }

    private static String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }

    public static int[] readData() throws IOException {
        ClassLoader classLoader = Main.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("resources\\GreedyFlorist.testcase1.txt");
        String data = readFromInputStream(inputStream);
        data = data.substring(0, data.length()-1);
        String[] stringArray = data.split(" ");
        int[] arr = new int[stringArray.length];
        int i = 0;
        for(String number : stringArray) {
            arr[i] = Integer.parseInt(number);
            i++;
        }
        return arr;
    }

}
