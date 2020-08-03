package two_dimensional;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of raw and column of matrix: ");

        int n = scanner.nextInt();
        int k = 1;

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = k++;
            }

        }

        System.out.println("Here is your matrix:");
        print(array);

    }


    public static void print(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");

            }
            System.out.println(" ");
        }
    }
}

