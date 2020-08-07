package two_dimensional;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of raw and column of matrix: ");

        int n = scanner.nextInt();


        int[][] array = new int[n][n];
        fill_as_triangle(array);

        System.out.println("Here is your matrix");
        print(array);
    }

    public static void fill_as_triangle (int[][] array) {
        int number = 1;
        int b = 0;
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = b++; j < array.length; j++) {
                array[i][j] = number++;
            }
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < k ; j++) {
                array[i][j] = number++;
            }
            k++;
        }

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
