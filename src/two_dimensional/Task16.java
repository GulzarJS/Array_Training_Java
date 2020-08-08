package two_dimensional;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dimension of matrix: ");

        int n = scanner.nextInt();

        int[][] array = new int[n][n];
        int k = 1;
        int column_counter = 1;

        for (int i = 0; i < n; i++) {

            if((column_counter%2) == 0) {
                k = n * column_counter;
                for (int j = 0; j < n; j++) {
                    array[j][i] = k--;
                }
            }else{
                k = n * (column_counter - 1) + 1;
                for (int j = 0; j < n; j++) {
                    array[j][i] = k++;
                }
            }
            column_counter++;
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

