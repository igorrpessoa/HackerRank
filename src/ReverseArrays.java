public class ReverseArrays {
    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int lastPosition = a.length-1;
        int middle = Math.floorDiv(a.length, 2);
        for(int i = 0; i < middle; i++) {
            int aux = a[i];
            a[i] = a[lastPosition];
            a[lastPosition] = aux;
            lastPosition--;
        }
        return a;
    }
}
