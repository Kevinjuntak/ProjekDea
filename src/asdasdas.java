import java.util.Scanner;

public class asdasdas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input array 1
        System.out.print("Enter list1: ");
        int[][] m1 = new int[3][3];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = input.nextInt();
            }
        }

        // user input array 2
        System.out.print("Enter list2: ");
        int[][] m2 = new int[3][3];
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = input.nextInt();
            }
        }

        //compare two arrays
        boolean identical = equals(m1, m2);

        //show result compare
        if (identical) {
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays are not identical.");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length && m1[0].length != m2[0].length) {
            return true;
        }

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
dddddddddddd