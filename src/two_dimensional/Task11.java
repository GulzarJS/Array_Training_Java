package two_dimensional;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dimension of matrix: ");

        int n = scanner.nextInt();

        int[][] array = new int[n][n];
        int k;

        for (int i = 0; i < n; i++) {
            k = n * (i + 1);
            for (int j = 0; j < n; j++) {
                array[i][j] = k--;
            }
        }

        System.out.println("Here is your matrix");
        print(array);
    }

    public static void print ( int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");

            }
            System.out.println(" ");
        }
    }
}
