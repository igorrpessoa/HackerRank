import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLeftRotation {
    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */


    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        int size = arr.size();
        Integer[] finalArray = new Integer[size];
        for (int i = 0; i < size; i++) {
            int posFinal = i - d;
            posFinal = posFinal + size;
            posFinal = posFinal % size;
            finalArray[posFinal] = arr.get(i);
        }
        List<Integer> targetList = new ArrayList<>(Arrays.asList(finalArray));

        return targetList;
    }
}
