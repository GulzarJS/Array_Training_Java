package two_dimensional;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of raws and columns of matrix: ");

        int n = scanner.nextInt();

        int[][] array = new int[n][n];
        int k = 1;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[j][i] = k++;
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

