
public class sum {
    public static void main(String[] args) {
        int[][] numList = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};

        System.out.println("masukin nilai kamu");

        for (int i = 0; i < numList.length; i++) {
            for (int j = 0; j < numList[i].length; j++) {
                numList[i][j] = numList[1][0];
            }
        }
        for (int i = 0; i < numList[0].length; i++){
            System.out.println("Average sum of the column: " + i + " is " + sumArray(numList,i)) ;
        }
    }
    public static double sumArray (int[][]numlist, int columIndex) {
        double sum = 0;
        for (int i = 0; i < numlist.length; i++) {
            sum += numlist[i][columIndex];
        }
        return sum;
    }
}

