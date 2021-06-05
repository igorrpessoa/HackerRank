public class TwoDArrayDS {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int biggestValue = - 1000;
        int indexRow = 0,indexColumn = 0;
        for (int i = 0; i < 16; i++) {
            int count = arr[indexRow][indexColumn] + arr[indexRow][indexColumn+1] + arr[indexRow][indexColumn+2] +
                    arr[indexRow+1][indexColumn+1] +
                    arr[indexRow+2][indexColumn] + arr[indexRow+2][indexColumn+1] + arr[indexRow+2][indexColumn+2] ;

            if(count > biggestValue){
                biggestValue = count;
            }
            System.out.println(indexRow + " " + indexColumn + " " + count);

            if(indexColumn == 3){
                indexRow ++;
                indexColumn=0;
            } else {
                indexColumn++;
            }
        }
        return biggestValue;
    }
}
