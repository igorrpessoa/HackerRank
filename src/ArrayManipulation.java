import java.util.HashMap;
import java.util.Map;

public class ArrayManipulation {
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long bestValue = -1;
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < queries.length; i++) {
            long a = queries[i][0];
            long b = queries[i][1];
            long k = queries[i][2];

            map.put(a, (map.containsKey(a) ? map.get(a) : 0) + k);
            map.put(b + 1, (map.containsKey(b+1) ? map.get(b+1) : 0) - k);
        }
        long value = 0;
        long max = 0;
        for (long i = 0; i < n; i++) {
            value += (map.containsKey(i+1) ? map.get(i+1) : 0);
            max = Math.max(max, value);
        }

        return max;
    }
}
