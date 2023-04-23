import java.util.Scanner;

public class asdasdasdasdasd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // meminta pengguna memasukkan nilai untuk array pertama
        System.out.print("Masukkan nilai untuk matriks pertama (3x3): ");
        int[][] m1 = new int[3][3];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = input.nextInt();
            }
        }

        // meminta pengguna memasukkan nilai untuk array kedua
        System.out.print("Masukkan nilai untuk matriks kedua (3x3): ");
        int[][] m2 = new int[3][3];
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = input.nextInt();
            }
        }

        // membandingkan kedua array
        boolean identical = equals(m1, m2);

        // menampilkan hasil perbandingan
        if (identical) {
            System.out.println("Kedua array identik.");
        } else {
            System.out.println("Kedua array tidak identik.");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        boolean identical = true;
        boolean found = false;

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                found = false;

                for (int k = 0; k < m2.length; k++) {
                    for (int l = 0; l < m2[k].length; l++) {
                        if (m1[i][j] == m2[k][l]) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        break;
                    }
                }

                if (!found) {
                    identical = false;
                    break;
                }
            }
            if (!identical) {
                break;
            }
        }

        return identical;
    }
}
